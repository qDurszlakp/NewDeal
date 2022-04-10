package com.sandbox.experimental;

import lombok.val;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringSimplifierTest implements WithAssertions {

    @ParameterizedTest
    @CsvSource({
            "ąęćżźłóśćĄĘĆŻŹŁÓŚĆ, aeczzloscAECZZLOSC",
            "áčďéěíňóřšťúůýžÁČĎÉĚÍŇÓŘŠŤÚŮÝŽ, acdeeinorstuuyzACDEEINORSTUUYZ",
            "öüßÖÜẞ, oussOUSS",
            "śü]>, su",
            ">>>śü]>, _su"
    })
    void simplifierTest(String input, String expected) {
        // when
        val result = StringSimplifier.simplify(input);
        // then
        assertThat(result).isEqualTo(expected);
    }

}