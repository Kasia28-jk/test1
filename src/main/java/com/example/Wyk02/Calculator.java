package com.example.Wyk02;

public class Calculator
{
    public int add(int x,int y)
    {
        return x+y;
    }

    public double div(int x, int y)
    {
        if(y==0)
        {
            throw new ArithmeticException("number can not by divide by 0");
        }
        return x/y;
    }
}

