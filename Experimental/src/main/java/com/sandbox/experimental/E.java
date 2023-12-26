package com.sandbox.experimental;

public class E extends Exception {
    public E() {
    }

    public E(String message) {
        super(message);
    }

    public E(Throwable cause) {
        super(cause);
    }
}
