package com.company.funcbasestructure;

import java.util.function.BiFunction;

public class PassingFunctionsAsData {

    protected static class MyMath {
        public static Integer add( Integer x, Integer y) {
            return x + y;
        }

        public static Integer substract ( Integer x, Integer y) {
            return x - y;
        }

        public static Integer combine2and3 (BiFunction<Integer, Integer, Integer> combineFunction) {
            return combineFunction.apply(2, 3);
        }
    }

    public static void main(String[] args) {
        System.out.println(MyMath.combine2and3(MyMath::add));
        System.out.println(MyMath.combine2and3(MyMath::substract));
        System.out.println(MyMath.combine2and3((x, y) -> x * 2 + y * 2));
    }
}
