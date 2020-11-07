package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

import static com.util.Calculator.result;


public class JunitDemo_1_1Base {
   @Test
    public void addTest() {
       int result = Calculator.add(4, 3);
       System.out.println(result);
   }
   @Test
    public void countTest() throws InterruptedException{
        int result = Calculator.count( 3);
       result = Calculator.count( 3);
       result = Calculator.count( 3);
       result = Calculator.count( 3);
        System.out.println(result);
    }
   @Test
    public void substractTest(){
       int result=Calculator.substract(10,2);
        System.out.println(result);
    }
    @Test
    public void multiplyTest(){
        int result=Calculator.substract(10,2);
        System.out.println(result);
    }
    @Test
    public void divideTest(){
        int result=Calculator.divide(10,2);
        System.out.println(result);
    }
}
