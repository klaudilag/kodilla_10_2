package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    void addTest(){
        double result = calculator.add(4,4);
        Assertions.assertEquals(8,result);
    }
    @Test
    void subTest(){
        double result = calculator.sub(30,10);
        Assertions.assertEquals(result, 20);
    }
    @Test
    void mulTest(){
        double result = calculator.mul(200,2);
        Assertions.assertEquals(400,result);
    }
    @Test
    void divTest(){
        double result = calculator.div(200,2);
        Assertions.assertEquals(result,100);
    }
}
