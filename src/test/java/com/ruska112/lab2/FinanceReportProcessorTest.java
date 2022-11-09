package com.ruska112.lab2;

import com.ruska112.sem4.MyDate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportProcessorTest {

    FinanceReport financeReport;

    @Before
    public void setup() {
        financeReport = new FinanceReport(5, "Ruska", new MyDate(2022, 11, 6));
        for (int i = 0; i < 3; i++) {
            financeReport.setPayment(i, new Payment(String.format("%s%d", "ded", i), new MyDate((2000 + i), 3, 18), (100_000 + i)));
        }
        financeReport.setPayment(3, new Payment("Android", new MyDate(2022, 2, 24), 101_000_00));
        financeReport.setPayment(4, new Payment("Block", new MyDate(2022, 8, 24), 112_000_00));
    }

    @Test
    public void getAllPaymentsFromCharTest() {
        String str = FinanceReportProcessor.getAllPaymentsFromChar(financeReport, 'a').toString();
        System.out.println("getAllPaymentsFromCharTest\n" + str);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAllPaymentsFromCharBadTest() {
        FinanceReportProcessor.getAllPaymentsFromChar(null, 'a');
    }

    @Test
    public void getAllPaymentsFromCharEmptyTest() {
        String str = FinanceReportProcessor.getAllPaymentsFromChar(financeReport, 'z').toString();
        System.out.println("getAllPaymentsFromCharEmptyTest\n" + str);
    }
}