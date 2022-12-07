package com.ruska112.sem5;

public class Polynomial {
    private double[] odds;

    public double[] getOdds() {
        return odds;
    }

    public Polynomial(double... odds) {
        if (odds == null) {
            throw new IllegalArgumentException();
        }
        this.odds = odds;
    }

    public int getDegree() {
        return odds.length - 1;
    }

    public double solve(double x) {
        if (x == 0) {
            return odds[odds.length - 1];
        }
        double result = 0;
        for (double odd : odds) {
            result += Math.pow(x, this.getDegree()) * odd;
        }
        return result;
    }

    public double solveDerivative(double x) {
        if (x == 0) {
            return  odds[odds.length-2];
        }
        double result = 0;
        for (int i = 0; i < odds.length-1; i++) {
            result += Math.pow(x, this.getDegree()) * odds[i] * (this.getDegree() - 1 - i);
        }
        return result;
    }
}
