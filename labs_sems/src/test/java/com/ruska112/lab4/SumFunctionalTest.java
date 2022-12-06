package com.ruska112.lab4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumFunctionalTest {

    @Test
    public void sumFunctionalTestLinear0() {
        LinearFunction lf = new LinearFunction(1, 0, 0, 10);
        SumFunctional<LinearFunction> smlf = new SumFunctional<>();
        assertEquals(15.0, smlf.calculate(lf), 0.001);
    }

    @Test
    public void sumFunctionalTestLinear1() {
        LinearFunction lf = new LinearFunction(1, 1, 0, 20);
        SumFunctional<LinearFunction> smlf = new SumFunctional<>();
        assertEquals(33.0, smlf.calculate(lf), 0.001);
    }

    @Test
    public void sumFunctionalTestSin0() {
        SinFunction sf = new SinFunction(1, 1, 0, 2 * Math.PI);
        SumFunctional<SinFunction> smsf = new SumFunctional<>();
        assertEquals(0.0, smsf.calculate(sf), 0.001);
    }

    @Test
    public void sumFunctionalTestSin1() {
        SinFunction sf = new SinFunction(1, 1, 0, Math.PI);
        SumFunctional<SinFunction> smsf = new SumFunctional<>();
        assertEquals(1.0, smsf.calculate(sf), 0.001);
    }

    @Test
    public void sumFunctionalTestFractionalLinear0() {
        FractionalLinearFunction flf = new FractionalLinearFunction(1, 1, 1, 1, 0, 10);
        SumFunctional<FractionalLinearFunction> smflf = new SumFunctional<>();
        assertEquals(3.0, smflf.calculate(flf), 0.001);
    }

    @Test
    public void sumFunctionalTestFractionalLinear1() {
        FractionalLinearFunction flf = new FractionalLinearFunction(1, 2, 3, 4, 0, 10);
        SumFunctional<FractionalLinearFunction> smflf = new SumFunctional<>();
        assertEquals(1.2214, smflf.calculate(flf), 0.001);
    }

    @Test
    public void sumFunctionalTestExp0() {
        ExpFunction ef = new ExpFunction(1, 0, 0, 2);
        SumFunctional<ExpFunction> smef = new SumFunctional<>();
        assertEquals(11.1073, smef.calculate(ef), 0.001);
    }

    @Test
    public void sumFunctionalTestExp1() {
        ExpFunction ef = new ExpFunction(1, 1, 0, 2);
        SumFunctional<ExpFunction> smef = new SumFunctional<>();
        assertEquals(14.1073, smef.calculate(ef), 0.001);
    }
}