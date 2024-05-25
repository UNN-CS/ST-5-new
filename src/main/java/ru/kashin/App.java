package ru.kashin;

public class App
{
    public static void main( String[] args )
    {
        double vlue = Double.parseDouble("2.0");
        Sqrt koren = new Sqrt(vlue);
        double rezulatat = koren.calc();
        System.out.println("Sqrt of " + vlue + " = " + rezulatat);
    }
}
