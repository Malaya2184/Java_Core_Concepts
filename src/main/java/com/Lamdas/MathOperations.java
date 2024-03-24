package com.Lamdas;

@FunctionalInterface
public interface MathOperations<T> {

    T operate(T a, T b);
}
