package com.company.funcbasestructure;

import java.util.function.BiFunction;

import com.company.funcbasestructure.interfaces.NoArgFunction;
import com.company.funcbasestructure.interfaces.TriFunction;

public class BiFunctionEx {
    public static void main(String[] args) {
        BiFunction<Integer, Integer , Integer> myBiFunction = (x, y) -> x + y;
        System.out.println("BiFunction: " + myBiFunction.apply(10, 20));

        TriFunction<Integer, Integer, Integer, Integer> myTriFunction = 
            (x,y,z) -> x + y + z;
        System.out.println("TriFunction: " + myTriFunction.apply(10, 20, 30));

        NoArgFunction<String> myNoArgFunction = () -> "Say Hello!";
        System.out.println("NoArgFunction: " + myNoArgFunction.apply());
    }
}
