package com.sandbox

import spock.lang.Specification

class DemoClassTest extends Specification {

    DemoClass demoClass

    def setup() {
        demoClass = new DemoClass({ cardId -> "##" + cardId + "##" })
    }

    def "Should calculate hash properly"() {
        when:
            def hashedResult = demoClass.hash(cardId)
        then:
            hashedResult == expectedHash
        where:
            expectedHash << [
                    "##00000##", "##12345##", "##0000011111##"
            ]

            cardId << [
                    "00000", "12345", "0000011111"
            ]
    }
}