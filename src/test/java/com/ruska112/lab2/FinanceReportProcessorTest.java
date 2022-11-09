package com.ruska112.lab2;

import com.ruska112.sem4.MyDate;
import org.junit.Before;
import org.junit.Test;

public class FinanceReportProcessorTest {

    FinanceReport financeReport;

    @Before
    public void setup() {
        financeReport = new FinanceReport(5, "Ruska", new MyDate(2022, 11, 6));
        for (int i = 0; i < 3; i++) {
            financeReport.setPayment(i, new Payment(String.format("%s%d", "ded", i), new MyDate((2000 + i), 3, 18), (100 + i)));
        }
        financeReport.setPayment(3, new Payment("Android", new MyDate(2022, 2, 24), 101_000_00));
        financeReport.setPayment(4, new Payment("Block", new MyDate(2022, 8, 24), 112_00));
    }

    @Test
    public void getPaymentsFromCharTest() {
        String str = FinanceReportProcessor.getPaymentsFromChar(financeReport, 'a').toString();
        System.out.println("getPaymentsFromChar\n" + str);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getPaymentsFromCharBadTest() {
        FinanceReportProcessor.getPaymentsFromChar(null, 'a');
    }

    @Test
    public void getPaymentsFromCharEmptyTest() {
        String str = FinanceReportProcessor.getPaymentsFromChar(financeReport, 'z').toString();
        System.out.println("getPaymentsFromCharEmptyTest\n" + str);
    }

    @Test
    public void getPaymentsSumLessThanTest() {
        String str = FinanceReportProcessor.getPaymentsSumLessThan(financeReport, 1000_00).toString();
        System.out.println("getPaymentsSumLessThan\n" + str);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getPaymentsSumLessThanBadTest() {
        FinanceReportProcessor.getPaymentsSumLessThan(null, 1000);
    }

    @Test
    public void getPaymentsSumLessThanEmptyTest() {
        String str = FinanceReportProcessor.getPaymentsSumLessThan(financeReport, 10).toString();
        System.out.println("getPaymentsSumLessThanEmptyTest\n" + str);
    }
}