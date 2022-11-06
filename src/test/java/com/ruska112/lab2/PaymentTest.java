package com.ruska112.lab2;

import com.ruska112.sem4.MyDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentTest {

    @Test(expected = IllegalArgumentException.class)
    public void paymentConstructorTestFullNameError() {
        String fullName = null;
        MyDate date = new MyDate(2000, 1, 1);
        int sum = 100_000_000;
        Payment payment = new Payment(fullName, date, sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void paymentConstructorTestDateError() {
        String fullName = new String("Ded");
        MyDate date = null;
        int sum = 100_000_000;
        Payment payment = new Payment(fullName, date, sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void paymentConstructorTestSumError() {
        String fullName = new String("Ded");
        MyDate date = new MyDate(2000, 1, 1);
        int sum = -100_000_000;
        Payment payment = new Payment(fullName, date, sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void paymentEqualsTest() {
        String fullName = new String("Ded");
        MyDate date = new MyDate(2000, 1, 1);
        int sum = 100_000_000;
        Payment payment1 = new Payment(fullName, date, sum);
        Payment payment2 = null;

        payment1.equals(payment2);
    }

    @Test
    public void paymentEqualsTestTrue() {
        String fullName = new String("Ded");
        MyDate date = new MyDate(2000, 1, 1);
        int sum = 100_000_000;
        Payment payment1 = new Payment(fullName, date, sum);
        Payment payment2 = new Payment(fullName, date, sum);

        assertTrue(payment1.equals(payment2));
    }

    @Test
    public void paymentEqualsTestFalse() {
        String fullName = new String("Ded");
        MyDate date = new MyDate(2000, 1, 1);
        int sum1 = 100_000_000;
        int sum2 = 100_000;
        Payment payment1 = new Payment(fullName, date, sum1);
        Payment payment2 = new Payment(fullName, date, sum2);

        assertFalse(payment1.equals(payment2));
    }
}
