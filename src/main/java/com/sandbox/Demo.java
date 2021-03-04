package com.sandbox;

public class Demo {

    private Scalable scalable;

    public Demo(Scalable scalable) {
        this.scalable = scalable;
    }

    public String foo() {
        return scalable.merge();
    }
}
