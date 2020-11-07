package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JunitDemo_2_1Assert {
   @Test
    public void addTest() {
       int result = Calculator.add(4, 3);
       System.out.println(result);
     //  assertEquals(6,result);//预期结果与实际结果不符
       assertEquals(7,result);//预期结果与实际结果相符
   }
   @Test
    public void countTest() throws InterruptedException{
        int result = Calculator.count( 3);
       result = Calculator.count( 3);
       result = Calculator.count( 3);
       result = Calculator.count( 3);
        System.out.println(result);
       assertEquals(12,result);//预期结果与实际结果相符

   }
   @Test
    public void substractTest(){
       int result=Calculator.substract(10,2);
        System.out.println(result);
       assertEquals(8,result);//预期结果与实际结果相符

   }
    @Test
    public void multiplyTest(){
        int result=Calculator.substract(10,2);
        System.out.println(result);
        assertEquals(8,result);//预期结果与实际结果相符

    }
    @Test
    public void divideTest(){
        int result=Calculator.divide(10,2);
        System.out.println(result);
        assertEquals(5,result);//预期结果与实际结果相符

    }
}
