package com.company;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
	// write your code here
        fizzBuzzBeforeJava8(100);
        fizzBuzzInJava8(100);
    }

    private static void fizzBuzzBeforeJava8(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 5 & 7
                System.out.println("Fizz Buzz");
            else if ((i % 3) == 0) // Is it a multiple of 3
                System.out.println("Fizz");
            else if ((i % 5) == 0) // Is it a multiple of 5
                System.out.println("Buzz");
            else if ((i % 7) == 0) // Is it a multiple of 7
                System.out.println("Multiple of Seven");
            else
                System.out.println(i); // Not a multiple of 5 or 7
        }
    }

    private static void fizzBuzzInJava8(int num) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Multiple of Seven" : i))
                .forEach(System.out::println);
    }
}
