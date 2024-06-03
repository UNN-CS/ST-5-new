package org.example;

public class App
{
    public static void main(String[] args)
    {
        double val = Double.parseDouble("3.0");
        Sqrt sqrt = new Sqrt(val);
        double result = sqrt.calc();
        System.out.println(sqrt.calc());
    }
}
