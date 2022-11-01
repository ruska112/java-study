package com.ruska112.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentTest {
    Payment payment1 = new Payment("Karabalin Ruslan", 11, 9, 2001, 112112);
    Payment payment2 = new Payment("Ruslan Karabalin", 11, 9, 2001, 112);

    @Test
    public void equalsTest() {
        assertFalse(payment1.equals(payment2));
    }

    @Test
    public void setFullNameTest() {
        try {
            String name = "";
            payment1.setFullName(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setSumTest() {
        try {
            payment1.setSum(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
