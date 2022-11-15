package com.company.funcbasestructure;

import java.util.function.Function;

public class LambdaExpressionEx {

    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = x -> x < 0 ? -x : x;
        System.out.println("Lambda function: " + absoluteValue.apply(-1000));
    }
    
}
