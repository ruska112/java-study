package com.ruska112.lab4;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegralFunctionalTest {

    @Test(expected = IllegalArgumentException.class)
    public void integralFunctionalExceptionTestLinear() {
        LinearFunction lf = new LinearFunction(1, 1, 0, 10);
        IntegralFunctional<LinearFunction> iflf = new IntegralFunctional<>(-10, 10);
        assertEquals(60.0, iflf.calculate(lf), 0.001);
    }

    @Test
    public void integralFunctionalTestLinear() {
        LinearFunction lf = new LinearFunction(1, 1, 0, 10);
        IntegralFunctional<LinearFunction> iflf = new IntegralFunctional<>(0, 10);
        assertEquals(60.0, iflf.calculate(lf), 0.001);
    }

    @Test
    public void integralFunctionalTestSin() {
        SinFunction sf = new SinFunction(1, 1, 0, Math.PI);
        IntegralFunctional<SinFunction> ifsf = new IntegralFunctional<>(0, Math.PI);
        assertEquals(2.0, ifsf.calculate(sf), 0.001);
    }

    @Test
    public void integralFunctionalTestFractionalLinear() {
        FractionalLinearFunction flf = new FractionalLinearFunction(1, 1, 1, 1, 0, 10);
        IntegralFunctional<FractionalLinearFunction> ifflf = new IntegralFunctional<>(0, 10);
        assertEquals(10.0, ifflf.calculate(flf), 0.001);
    }

    @Test
    public void integralFunctionalTestExp() {
        ExpFunction ef = new ExpFunction(1, 0, 0, 1);
        IntegralFunctional<ExpFunction> ifef = new IntegralFunctional<>(0, 1);
        assertEquals(1.7183, ifef.calculate(ef), 0.001);
    }
}