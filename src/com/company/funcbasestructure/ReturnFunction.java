package com.company.funcbasestructure;

import java.util.function.Function;

public class ReturnFunction {

    protected static class MyMath {
        // public static Integer timesTwo(Integer x) {
        //     return x * 2;
        // }

        // public static Integer timesThree(Integer x) {
        //     return x * 3;
        // }

        // public static Integer timesFour(Integer x) {
        //     return x * 4;
        // }

        public static Function<Integer, Integer> createMultiplier(Integer y) {
            return (Integer x) -> x * y;
        }
    }


    public static void main(String[] args) {
        // NoArgFunction<NoArgFunction<String>> createGreeder = () -> () -> "Hello function!!!";
        // NoArgFunction<String> greeder = createGreeder.apply();
        // System.out.println(greeder.apply());

        //(Integer x) -> x * 2
        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
        Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);

        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(3));
        System.out.println(timesFour.apply(4));

    }
}
