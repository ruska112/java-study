package com.ruska112.lab2;

import com.ruska112.sem4.MyDate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportTest {

    FinanceReport financeReport;

    @Before
    public void setup() {
        financeReport = new FinanceReport(3, "Ruska", new MyDate(2022, 11, 6));
        for (int i = 0; i < financeReport.countOfPayments(); i++) {
            financeReport.setPayment(i, new Payment(String.format("%s%d", "ded", i), new MyDate((2000 + i), 3, 18), (100_000 + i)));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void financeReportConstructorLengthTest() {
        FinanceReport financeReport1 = new FinanceReport(-1, "Ruska", new MyDate(2022, 11, 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void financeReportConstructorFullNameTest() {
        FinanceReport financeReport1 = new FinanceReport(3, null, new MyDate(2022, 11, 6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void financeReportConstructorMyDateTest() {
        FinanceReport financeReport1 = new FinanceReport(3, "Ruska", null);
    }

    @Test
    public void financeReportGetPaymentGoodTest() {
        System.out.println(financeReport.getPayment(0).toString());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void financeReportGetPaymentTest() {
        System.out.println(financeReport.getPayment(4).toString());
    }

    @Test
    public void financeReportToStringTest() {
        System.out.println(financeReport.toString());
    }

}