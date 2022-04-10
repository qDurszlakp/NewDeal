package com.sandbox.experimental;

import lombok.experimental.UtilityClass;

import java.text.Normalizer;
import java.util.Map;
import java.util.regex.Pattern;

@UtilityClass
public class StringSimplifier {

    private static final char DEFAULT_REPLACE_CHAR = '_';
    private static final String DEFAULT_REPLACE = String.valueOf(DEFAULT_REPLACE_CHAR);
    private static final Map<String, String> NON_DIACRITICS_MAP;
    private static final Pattern DIACRITICS_AND_FRIENDS = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+");

    static {
        NON_DIACRITICS_MAP = Map.ofEntries(
                Map.entry(".", ""),
                Map.entry("\"", ""),
                Map.entry("'", ""),
                Map.entry(" ", DEFAULT_REPLACE),
                Map.entry("]", DEFAULT_REPLACE),
                Map.entry("[", DEFAULT_REPLACE),
                Map.entry(")", DEFAULT_REPLACE),
                Map.entry("(", DEFAULT_REPLACE),
                Map.entry("=", DEFAULT_REPLACE),
                Map.entry("!", DEFAULT_REPLACE),
                Map.entry("/", DEFAULT_REPLACE),
                Map.entry("\\", DEFAULT_REPLACE),
                Map.entry("&", DEFAULT_REPLACE),
                Map.entry(",", DEFAULT_REPLACE),
                Map.entry("?", DEFAULT_REPLACE),
                Map.entry("°", DEFAULT_REPLACE),
                Map.entry("|", DEFAULT_REPLACE),
                Map.entry("<", DEFAULT_REPLACE),
                Map.entry(">", DEFAULT_REPLACE),
                Map.entry(";", DEFAULT_REPLACE),
                Map.entry(":", DEFAULT_REPLACE),
                Map.entry("_", DEFAULT_REPLACE),
                Map.entry("#", DEFAULT_REPLACE),
                Map.entry("~", DEFAULT_REPLACE),
                Map.entry("+", DEFAULT_REPLACE),
                Map.entry("*", DEFAULT_REPLACE),
                Map.entry("\u0142", "l"),
                Map.entry("\u0141", "L"),
                Map.entry("ß", "ss"),
                Map.entry("ẞ", "SS"),
                Map.entry("æ", "ae"),
                Map.entry("ø", "o"),
                Map.entry("©", "c"),
                Map.entry("ů", "u"),
                Map.entry("Ů", "U"),
                Map.entry("\u00D0", "D"),
                Map.entry("\u00F0", "d"),
                Map.entry("\u0110", "D"),
                Map.entry("\u0111", "d"),
                Map.entry("\u0189", "D"),
                Map.entry("\u0256", "d"),
                Map.entry("\u00DE", "th"),
                Map.entry("\u00FE", "th"));
    }

    public static String simplify(String orig) {
        String str = orig;
        if (str == null) {
            return null;
        }
        str = stripDiacritics(str);
        str = stripNonDiacritics(str);
        if (str.length() == 0) {
            return orig;
        }
        return str;
    }

    private static String stripDiacritics(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = DIACRITICS_AND_FRIENDS.matcher(str).replaceAll("");
        return str;
    }

    private static String stripNonDiacritics(String orig) {
        StringBuilder result = new StringBuilder();
        String lastChar = null;
        for (int i = 0; i < orig.length(); i++) {
            String source = orig.substring(i, i + 1);
            String replace = NON_DIACRITICS_MAP.get(source);
            String toReplace = replace == null ? source : replace;
            if (DEFAULT_REPLACE.equals(lastChar) && DEFAULT_REPLACE.equals(toReplace)) {
                toReplace = "";
            } else {
                lastChar = toReplace;
            }
            result.append(toReplace);
        }
        if (result.length() > 0 && DEFAULT_REPLACE_CHAR == result.charAt(result.length() - 1)) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}