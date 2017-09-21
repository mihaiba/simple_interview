package com.cgm.interview;

/*
Write a program that prints the numbers from 1 to 100.
For multiples of 3 print “Fizz”.
For multiples of 5 print “Buzz”.
For multiples of both 3 and 5 print “FizzBuzz”.
For other numbers just print the number.
*/
public class FizzBuzz {
    public static String transform(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        for (int index = 1; index <= 100; index++) {
            System.out.println(String.format("transform(%d) = %s", index, transform(index)));
        }
    }

}