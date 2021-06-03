package com.example.Wyk02;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTests
{
    @Test
    public void ShouldAddTwoNumbers()
    {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        int result = calculator.add(10,25);
        //THEN
        Assert.assertEquals(result,35);
    }

    @Test
    public void ShouldAddTwoNumbers2()
    {
        //GIVEN
        Calculator calculator = new Calculator();
        //THEN
        Assert.assertEquals(calculator.add(10,25),35);
        Assert.assertEquals(calculator.add(-5,-15),-20);
        Assert.assertEquals(calculator.add(-15,25),10);
    }

    @Test
    public void ShouldDivTwoNumbers()
    {
        //GIVEN
        Calculator calculator = new Calculator();
        //THEN
        Assert.assertEquals(calculator.div(100,10),10,0);
    }
/*
*
    @Test(expected = ArithmeticException.class)
    public void ShouldNotDivTwoNumbersByZero()
    {
        //GIVEN
        Calculator calculator = new Calculator();
        //THEN
        Assert.assertNotEquals(calculator.div(100,10),10,0);
    }*/
}
