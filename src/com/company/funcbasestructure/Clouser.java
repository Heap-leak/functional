package com.company.funcbasestructure;

import com.company.funcbasestructure.interfaces.NoArgFunction;

public class Clouser {
    // public static void main(String[] args) {
    //     NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
    //         String name = "Evgenii";
    //         return () -> "Hello, " + name;
    //     };

    //     NoArgFunction<String> greeter = createGreeter.apply();

    //     System.out.println(greeter.apply());
    // }

    protected static class MyMath {
        public static NoArgFunction<Integer> createMultiplier(Integer y) {
            Integer x = 6;
            return () -> x * y;
        }
    }


    public static void main(String[] args) {
        // NoArgFunction<NoArgFunction<String>> createGreeder = () -> () -> "Hello function!!!";
        // NoArgFunction<String> greeder = createGreeder.apply();
        // System.out.println(greeder.apply());

        //(Integer x) -> x * 2
        NoArgFunction<Integer> timesTwo = MyMath.createMultiplier(2);
        NoArgFunction<Integer> timesThree = MyMath.createMultiplier(3);
        NoArgFunction<Integer> timesFour = MyMath.createMultiplier(4);

        System.out.println(timesTwo.apply());
        System.out.println(timesThree.apply());
        System.out.println(timesFour.apply());

    }
}
