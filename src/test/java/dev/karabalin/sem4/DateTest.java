package dev.karabalin.sem4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTest {

    private Date date1, date2;

    @Before
    public void setup() {
        date1 = new Date(4, 4, 2003);
        date2 = new Date(8, 6, 2003);
    }

    @Test
    public void testIsBeforeNow() {
        Assert.assertTrue(date2.isBeforeNow(date1));
    }
}