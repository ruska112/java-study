package com.ruska112.lab4;

import java.util.ArrayList;

public class QuadraticEquation {
    // a * x^2 + b * x + c = 0
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ArrayList<Double> solve() {
        ArrayList<Double> roots = new ArrayList<>();

        if (a == 0) {
            if (b == 0) {
                return null;
            } else if (c == 0) {
                roots.add((double) 0);
            } else {
                roots.add(-c/b);
            }
        } else if (b == 0) {
            if (c == 0) {
                roots.add((double) 0);
            } else {
                roots.add(Math.sqrt(-c/a));
            }
        } else if (c == 0) {
            roots.add((double) 0);
            roots.add(Math.sqrt(-b/a));
        } else {

        }

        return roots;
    }
}
