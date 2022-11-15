package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterFunction {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> evens = listOfIntegers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("Evens: " + evens);

        String[] wordsArr = {"hello", "finctional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));
        
        IntFunction<Predicate<String>> wordsFilter = minLenght ->  str -> str.length() > minLenght;
        Predicate<String> isLongerThan3 = wordsFilter.apply(3);

        List<String> filteredWords = words.stream().filter(isLongerThan3).collect(Collectors.toList());
        System.out.println("Filtered words: " + filteredWords);
    }
}
