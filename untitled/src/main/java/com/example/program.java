package com.example;

class program
{
    public static void main(String[] args)
    {
        double val=Double.parseDouble("2.0");
        sqrt sqrt=new sqrt(val);
        double result=sqrt.calc();
        System.out.println("Sqrt of " + val + " = " + result);
    }
}