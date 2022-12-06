package com.ruska112.lab4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinFunctionTest {

    @Test
    public void solveTest0() {
        SinFunction sf = new SinFunction(1, 1, -100, 100);
        assertEquals(0.0, sf.solve(0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void solveTest1() {
        SinFunction sf = new SinFunction(1, 1, -100, 100);
        assertEquals(0.0, sf.solve(200), 0.001);
    }

    @Test
    public void solveTest2() {
        SinFunction sf = new SinFunction(1, 1, -100, 100);
        assertEquals(1.0, sf.solve(Math.PI / 2), 0.001);
    }

}