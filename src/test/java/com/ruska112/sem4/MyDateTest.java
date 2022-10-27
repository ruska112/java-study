package com.ruska112.sem4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDateTest {

    MyDate date1;
    MyDate date2;

    @Before
    public void setUp() throws Exception {
        date1 = new MyDate(4, 4, 2003);
        date2 = new MyDate(8, 6, 2003);
    }

    @Test
    public void isBefore() {
        assertTrue(date2.isBefore(date1));
    }

}