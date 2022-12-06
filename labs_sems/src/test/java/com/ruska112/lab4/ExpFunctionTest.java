package com.ruska112.lab4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpFunctionTest {

    @Test
    public void solveTest0() {
        ExpFunction ef = new ExpFunction(1, 0, -100, 100);
        assertEquals(1.0, ef.solve(0), 0.001);
    }

    @Test
    public void solveTest1() {
        ExpFunction ef = new ExpFunction(1, 0, -100, 100);
        assertEquals(15.1543, ef.solve(Math.E), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void solveTest2() {
        ExpFunction ef = new ExpFunction(1, 0, -100, 100);
        ef.solve(200);
    }
}