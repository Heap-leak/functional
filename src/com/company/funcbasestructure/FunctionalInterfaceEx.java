package com.company.funcbasestructure;

import java.util.function.Function;

public class FunctionalInterfaceEx {
    protected static class MyMath{
        public static Integer triple( Integer x ) {
            return x * 3;
        }
    }
    public static void main(String[] args) throws Exception {
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println("Functional interface: " + result);
    }
}
