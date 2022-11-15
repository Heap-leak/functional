package com.company.advanced;

import java.util.function.BiFunction;
import java.util.function.IntFunction;

import com.company.funcbasestructure.interfaces.TriFunction;

public class PartialApplication {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;
        IntFunction<BiFunction<Integer, Integer, Integer>> addPartial = x -> (y, z) -> add.apply(x, y, z);
        
        BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);

        System.out.println(add5.apply(5, 6));




    }
}
