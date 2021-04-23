package com.sandbox.experimental

import spock.lang.Specification

class DemoServiceTest extends Specification {

    def demoService
    def demoFunctionalityMock

    def setup() {
        demoFunctionalityMock = Mock(DemoFunctionalityImpl)
        demoService = new DemoService(demoFunctionalityMock)
    }

    def "Should properly add service suffix"() {
        when:
        def result = demoService.foo(input)

        then:
        demoFunctionalityMock.foo(_) >> "LOREM"
        result == expectedHash

        where:
        expectedHash << [
                "LOREM service value.", "LOREM service value.", "LOREM service value."
        ]

        input << [
                "X", "D", "Z"
        ]
    }
}
