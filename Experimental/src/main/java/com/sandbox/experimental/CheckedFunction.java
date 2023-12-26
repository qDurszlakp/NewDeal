package com.sandbox.experimental;

@FunctionalInterface
public interface CheckedFunction<T,R> {
    R apply(T t) throws E;
}
