package org.example;

public class Sqrt {
    double argue;
    double del=0.00000001;

    public Sqrt(double argue) {
        this.argue=argue;
    }

    public boolean good(double n1,double n2) {
        return Math.abs(n1 * n1 - n2) < del;
    }

    public double improve(double n1,double n2) {
        double result = average(n1,n2 / n1);
        return result;
    }

    public double average(double n1,double n2) {
        double result = (n1 + n2) / 2.0;
        return result;
    }

    public double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }

    public double calc() {
        return iter(1.0 , argue);
    }
}