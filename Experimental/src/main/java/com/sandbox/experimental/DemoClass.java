package com.sandbox.experimental;

import java.util.function.Function;

public class DemoClass {

    private final Function<String, String> hashStrategy;

    public DemoClass(Function<String, String> hashStrategy) {
        this.hashStrategy = hashStrategy;
    }

    public String hash(String cardId) {
        return hashStrategy.apply(cardId);
    }
}