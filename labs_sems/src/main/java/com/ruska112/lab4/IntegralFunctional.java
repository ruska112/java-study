package com.ruska112.lab4;

public class IntegralFunctional<T extends IOneRealArgument> implements IFunctional<T> {
    private double left;
    private double right;

    public IntegralFunctional(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(T function) {
        if (left < function.getLeftLimit() || right > function.getRightLimit()) {
            throw new IllegalArgumentException("Bad limits for integral");
        }

        double result = 0;
        double delta = Math.abs(function.getRightLimit() - function.getLeftLimit()) / 2;

        for (double i = left; Math.abs(i - right) < 0.001; i += delta) {
            result += function.solve(left + i * delta + delta / 2) * delta;
        }
        return result;
    }
}
