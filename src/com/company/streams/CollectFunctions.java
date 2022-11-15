package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectFunctions {
    public static void main(String[] args) {
        String[] wordsArr = {"hello", "finctional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        IntFunction<Predicate<String>> wordsFilter = minLenght ->  str -> str.length() > minLenght;
        Predicate<String> isLongerThan3 = wordsFilter.apply(5);

        Map<Boolean, List<String>> longWords = words.stream()
            // .filter(isLongerThan3)
            .collect(Collectors.partitioningBy(isLongerThan3));//.groupingBy((word) -> word.length()));

        System.out.println(longWords);
    }
}
