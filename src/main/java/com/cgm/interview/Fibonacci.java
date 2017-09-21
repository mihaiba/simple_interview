package com.cgm.interview;

import java.util.HashMap;
import java.util.Map;

/*
The Fibonacci Sequence is the series of numbers:
Position: 0| 1| 2| 3| 4| 5| 6|  7|  8|  9| 10| 11|  12|  13|  14|  15|  16|   17|   18|   19|   20|    21|    22|    23|    24|    25|     26|     27|     28| ...
Value:    0| 1| 1| 2| 3| 5| 8| 13| 21| 34| 55| 89| 144| 233| 377| 610| 987| 1597| 2584| 4181| 6765| 10946| 17711| 28657| 46368| 75025| 121393| 196418| 317811| ...
The next number is found by adding up the two numbers before it.
The 2 is found by adding the two numbers before it (1+1)
The 3 is found by adding the two numbers before it (1+2),
And the 5 is (2+3),
and so on!
Write a program that finds the nth number in the sequence.
 */
public class Fibonacci {
    public static final Map<Long, Long> cache = new HashMap<>();

    public static long recursiveInefficientFibonacci(long index) {
        if (index == 0) {
            return 0;
        }
        if (index <= 2) {
            return 1;
        }
        return recursiveInefficientFibonacci(index - 1) + recursiveInefficientFibonacci(index - 2);
    }

    public static long iterativeFibonacci(long index) {
        long pred = 1, succ = 1;
        long result = 0;
        for (long i = 0; i < index - 2; i++) {
            result = pred + succ;
            pred = succ;
            succ = result;
        }
        return result;
    }

    public static long recursiveEfficientFibonacci(long index) {
        if (index == 0) {
            return 0;
        }
        if (index <= 2) {
            return 1;
        } else {
            return cache.computeIfAbsent((long) index, (key) -> recursiveEfficientFibonacci(index - 1) + recursiveEfficientFibonacci(index - 2));
        }
    }

    private static long fibonacci(long a, long b, long index) {
        if (index == 0) return a;
        else return fibonacci(b, a + b, index - 1);
    }

    public static long bestRecursiveFibonacci(int index) {
        final long fibonacci = fibonacci(0, 1, index);
        return fibonacci;
    }

    public static void main(String[] args) {
        System.out.println("bestRecursiveFibonacci(50) = " + bestRecursiveFibonacci(1000));
        //System.out.println("recursiveInefficientFibonacci(10) = " + recursiveInefficientFibonacci(50));
        System.out.println("iterativeFibonacci(50) = " + iterativeFibonacci(1000));
        //System.out.println("recursiveEfficientFibonacci(10) = " + recursiveEfficientFibonacci(50));
    }
}