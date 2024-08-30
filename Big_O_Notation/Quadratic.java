package com.codewithmartin

public class Quadratic {

    public void log(int[] numbers) {
        // 0 (n^2)
        for (int first : numbers) // 0(n)
         for (int second : numbers) // 0(n)
             System.out.println(first + "," + second);
        
    }
}
