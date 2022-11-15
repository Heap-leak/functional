package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsFunction {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        Integer sum = listOfIntegers.parallelStream().reduce(0, (acc, x) -> {
            System.out.println("acc: " + acc + ", x: " + x);
            return acc + x;
        
        });
        System.out.println(sum);

        String[] wordsArr = {"hello", "finctional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));
        List<String> processingWords = words.parallelStream()
            .map((word) -> {
                System.out.println("Processing word: " + word);
                return word.toUpperCase();
            })
            .map((word) -> {
                System.out.println("Adding exclamation point to: " + word);
                return word + "!";
            }).collect(Collectors.toList());

            System.out.println(processingWords);
    }
}
