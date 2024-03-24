package com.lamdasPractice;

@FunctionalInterface
public interface MyFunctionalInterface<T,R> {
    R process(T val);
}
