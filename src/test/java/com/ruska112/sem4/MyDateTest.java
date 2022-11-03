package com.ruska112.sem4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDateTest {

    MyDate date1;
    MyDate date2;

    @Test
    public void isBefore() {
        assertTrue(date2.isBefore(date1));
    }

}