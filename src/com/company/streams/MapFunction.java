package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class MapFunction {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        UnaryOperator<Integer> doubleFunction = x -> x * 2;
        
        List<Integer> doubled = listOfIntegers.stream().map(doubleFunction).collect(Collectors.toList());

        System.out.println("Start: " + listOfIntegers);
        System.out.println("Result: " + doubled);
    }
}
