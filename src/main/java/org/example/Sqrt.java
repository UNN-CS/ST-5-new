package org.example;

public class Sqrt {
    double delta=0.00000001;
    double arg;

    public Sqrt(double arg) {
        this.arg=arg;
    }
    public double average(double x,double y) {
        double res = (y + x) / 2.0;
        return res;
    }
    public boolean good(double guess,double x) {
        boolean res = Math.abs(guess*guess-x)<delta;
        return res;
    }
    public double improve(double guess,double x) {
        double res = average(guess,x/guess);
        return res;
    }
    public double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public double calc() {
        return iter(1.0,arg);
    }
}