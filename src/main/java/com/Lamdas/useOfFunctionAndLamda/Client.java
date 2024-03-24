package com.Lamdas.useOfFunctionAndLamda;

import java.util.function.Function;

public class Client {

    public static void main(String[] args) {
        System.out.println(deciider("upper").apply("malaya"));
    }

//    returning a lamda function having 1 param and 1 return type
    public static Function<String, String> deciider(String input){
        if (input == "upper") {
            // implementation of Function provided
            return (value) -> printUpperCase(value);
        } else if (input == "lower") {
//            this lamda have same signature as the Function interface implmentation
            return Client::printLowerCase;
        }else{
            return Client::printNormal;
        }
    }

//    print upper case
    public static String printUpperCase(String value){
        return value.toUpperCase();
    }
//    print lower case
    public static String printLowerCase(String value){
        return value.toLowerCase();
    }
//    print normal string
    public  static  String printNormal(String value){
        return value;
    }
}
