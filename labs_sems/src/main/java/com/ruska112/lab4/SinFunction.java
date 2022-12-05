package com.ruska112.lab4;

public class SinFunction implements IOneRealArgument {
    private double a;
    private double b;

    private double leftLimit;
    private double rightLimit;

    @Override
    public double getLeftLimit() {
        return leftLimit;
    }

    @Override
    public double getRightLimit() {
        return rightLimit;
    }

    public SinFunction(double a, double b, double leftLimit, double rightLimit) {
        this.a = a;
        this.b = b;
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    @Override
    public double solve(double x) {
        return a * Math.sin(b * x);
    }
}
