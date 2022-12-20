package org.niit;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest
{
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }


//    @org.junit.jupiter.api.Test
    @Test
    public void addition(){
//        int result = calculator.addition(10,20);
//        assertEquals(30,result);
//        assertEquals(-10,calculator.subtraction(10,20));
        Assertions.assertEquals(30,calculator.addition(10,20));
    }

   @Test
    public void subtraction(){
        Assertions.assertEquals(-10,calculator.subtraction(10,20));
    }

    @Test
    public void multiplication(){
        Assertions.assertEquals(200,calculator.multiplication(10,20));
    }

    @Test
    public void division(){
        Assertions.assertEquals(0.5, calculator.division(10,20));
    }

}
