package com.ruska112.lab2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PaymentTest {
    Payment payment1;
    Payment payment2;

    @Before
    public void Setup(){
        payment1 = new Payment("Karabalin Ruslan", 11, 9, 2001, 112112);
        payment1 = new Payment("Ruslan Karabalin", 11, 9, 2001, 112);
    }

    @Test
    public void equalsTest() {
        assertFalse(payment1.equals(payment2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setFullNameTest() {
        try {
            String name = new String();
            payment1.setFullName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setSumTest() {
        try {
            payment1.setSum(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
