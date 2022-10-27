package com.ruska112.sem4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDateTest {

    MyDate date1;
    MyDate date2;

    @Before
    public void setUp() throws Exception {
        date1 = new MyDate(31, 5, 2003);
        date2 = new MyDate(8, 6, 2003);
    }

    @Test
    public void setDay() {
        try {
            date1.setMonth(4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void isBefore() {
        assertTrue(date2.isBefore(date1));
    }
}