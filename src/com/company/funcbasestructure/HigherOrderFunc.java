package com.company.funcbasestructure;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunc {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) ->  x / y;
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsNotZeroCheck = (func) -> ( x, y ) -> {
                if( y == 0f) {
                    System.out.println("Error: can't divide by zero");
                    return 0f;
                }
                return func.apply(x, y);
            };

        Float result = secondArgIsNotZeroCheck.apply(divide).apply(4f, 2f);  
        System.out.println(result);  
        
        Float resultZero = secondArgIsNotZeroCheck.apply(divide).apply(4f, 0f);  
        System.out.println(resultZero);
    };


}
