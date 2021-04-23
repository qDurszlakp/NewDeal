package com.sandbox.experimental;

public class DemoService {

    private final DemoFunctionalityImpl demoFunctionality;

    public DemoService(DemoFunctionalityImpl demoFunctionality) {
        this.demoFunctionality = demoFunctionality;
    }

    public String foo(String hash) {
        return demoFunctionality.foo(hash) + " service value.";
    }
}
