package com.cgm.interview.test;

import com.cgm.interview.FizzBuzz;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FizzBuzzTest {


    public void testIfIsDivisible(){
        Assert.assertEquals("Fizz", FizzBuzz.printMsg(3));
        Assert.assertEquals("Buzz", FizzBuzz.printMsg(5));
        Assert.assertEquals("FizzBuzz", FizzBuzz.printMsg(15));
        Assert.assertEquals("1", FizzBuzz.printMsg(1));
    }

}