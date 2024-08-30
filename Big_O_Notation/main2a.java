package com.codewithmartin
public interface main2a {
    public void log(int[] numbers) {
        //0(n)
        for (int number: numbers) // 0(n)
            System.out.println(number);
        for (int number : numbers) // 0(n)
        System.out.println(number);
             

    }
}
