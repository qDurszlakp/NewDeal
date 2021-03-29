package com.sandbox.app

import com.sandbox.experimental.DemoClass
import spock.lang.Specification
import spock.lang.Unroll

class DemoClassTest extends Specification {

    DemoClass demoClass

    def setup() {
        demoClass = new DemoClass({ cardId -> "##" + cardId + "##" })
    }

    def "Should calculate hash properly variant 1"() {
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

    @Unroll
    def "Should calculate hash properly variant 2 where cardId: #cardId"() {
        expect:
        hashedResult == demoClass.hash(cardId)

        where:
        hashedResult     | cardId
        "##00000##"      | "00000"
        "##12345##"      | "12345"
        "##0000011111##" | "0000011111"
    }

}
