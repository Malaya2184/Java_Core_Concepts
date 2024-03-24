package com.generics;

public class Pair<T1, T2> {

    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public double add(){
        try {
            if (first instanceof Number && second instanceof Number) {
                return ((Number)first).doubleValue() + ((Number)second).doubleValue();
            } else {
                throw new UnsupportedOperationException("Addition is only supported for numeric types.");
            }
        }catch (Exception e){
            throw  new UnsupportedOperationException("No supported");
        }
    }
}
