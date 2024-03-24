package com.lamdasPractice;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

public class ReturnAFunction {
    public static void main(String[] args) {

        System.out.println(decider("Upper").process("malaya"));
    }
    public static @NotNull MyFunctionalInterface<String, String> decider(String decide){
        if(decide== "Upper"){
            return (val) -> printUpper(val);
        } else if (decide=="Lower") {
            return (val) -> printLower(val);
        }
        return ReturnAFunction::printNormal;
    }

    public static String printUpper(@NotNull String val){
        return val.toUpperCase();
    }

    public static String printLower(@NotNull String val){
        return val.toLowerCase();
    }

    public static  String printNormal(String val){
        return val;
    }
}
