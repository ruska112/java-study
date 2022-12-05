package com.ruska112.lab4;

public class LinearFunction implements IOneRealArgument {
    private double a;
    private double b;

    private double leftLimit;
    private double rightLimit;

    public LinearFunction(double a, double b, double leftLimit, double rightLimit) {
        if (leftLimit > rightLimit) {
            throw new IllegalArgumentException("Bad limits left less than right");
        }

        this.a = a;
        this.b = b;
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    @Override
    public double getLeftLimit() {
        return leftLimit;
    }

    @Override
    public double getRightLimit() {
        return rightLimit;
    }

    @Override
    public double solve(double x) {
        return a * x + b;
    }
}
