package com.cgm.interview;

import java.util.List;

/*
Write a program that prints the numbers from 1 to 100.
For multiples of 3 print “Fizz”.
For multiples of 5 print “Buzz”.
For multiples of both 3 and 5 print “FizzBuzz”.
For other numbers just print the number.
*/
public class FizzBuzz {

    public static String printMsg(int number) {
        String resultMsg = "";
        if (number % 3 == 0) {
            resultMsg += "Fizz";
        }
        if (number % 5 == 0) {
            resultMsg += "Buzz";
        }

        if (number % 3 != 0 && number % 5 != 0) {
            resultMsg = String.valueOf(number);
        }
        return resultMsg;
    }


    public static void main(String[] args) {
        System.out.println(FizzBuzz.printMsg(0));
    }
}