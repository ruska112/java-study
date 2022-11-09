package com.ruska112.lab2;

public class FinanceReportProcessor {
    public static FinanceReport getPaymentsFromChar(FinanceReport financeReport, char c) {
        if (financeReport == null) {
            throw new IllegalArgumentException("FinanceReportProcessor getAllPaymentsFromChar: financeReport is null");
        } else {
            int len = 0;
            for (int i = 0; i < financeReport.length(); i++) {
                if (financeReport.getPayment(i).getFullName().toLowerCase().charAt(0) == c) {
                    len++;
                }
            }
            if (len != 0) {
                FinanceReport result = new FinanceReport(len, financeReport.getFullNameReporter(), financeReport.getDateOfReport());
                int j = 0;
                for (int i = 0; i < financeReport.length(); i++) {
                    if (financeReport.getPayment(i).getFullName().toLowerCase().charAt(0) == c) {
                        result.setPayment(j, financeReport.getPayment(i));
                        j++;
                    }
                }
                return result;
            } else {
                return new FinanceReport();
            }
        }
    }

    public static FinanceReport getPaymentsSumLessThan(FinanceReport financeReport, int sum) {
        if (financeReport == null) {
            throw new IllegalArgumentException("FinanceReportProcessor getAllPaymentsFromChar: financeReport is null");
        } else {
            int len = 0;
            for (int i = 0; i < financeReport.length(); i++) {
                if (financeReport.getPayment(i).getSum() < sum) {
                    len++;
                }
            }
            if (len != 0) {
                FinanceReport result = new FinanceReport(len, financeReport.getFullNameReporter(), financeReport.getDateOfReport());
                int j = 0;
                for (int i = 0; i < financeReport.length(); i++) {
                    if (financeReport.getPayment(i).getSum() < sum) {
                        result.setPayment(j, financeReport.getPayment(i));
                        j++;
                    }
                }
                return result;
            } else {
                return new FinanceReport();
            }
        }
    }
}