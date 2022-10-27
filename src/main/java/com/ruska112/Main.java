package com.ruska112;

import com.ruska112.lab2.FinanceReport;
import com.ruska112.lab2.Payment;
import com.ruska112.lab2.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            Payment payment = new Payment("Ruslan Karabalin", 1, 1, 2000, 1213);
            FinanceReport fr = new FinanceReport(4, "ABOBA", 1, 1, 1);
            fr.setPayment(0, "Ruska", 1, 1, 2000, 1213);
            fr.setPayment(1, "Ruska", 1, 1, 2000, 1213);
            System.out.println(fr.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}