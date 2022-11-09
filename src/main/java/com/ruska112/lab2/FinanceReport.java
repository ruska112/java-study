package com.ruska112.lab2;

import com.ruska112.sem4.MyDate;

public class FinanceReport {
    private Payment[] paymentsArray;
    private String fullNameReporter;

    private MyDate dateOfReport;

    public int countOfPayments() {
        return paymentsArray.length;
    }

    public FinanceReport(int length, String fullNameReporter, MyDate dateOfReport) {
        if (length <= 0) {
            throw new IllegalArgumentException("FinanceReport constructor: length argument less or equals 0!");
        } else {
            if (fullNameReporter == null) {
                throw new IllegalArgumentException("FinanceReport constructor: fullNameReporter argument is null!");
            } else {
                if (dateOfReport == null) {
                    throw new IllegalArgumentException("FinanceReport constructor: dateOfReport argument is null!");
                } else {
                    paymentsArray = new Payment[length];
                    this.fullNameReporter = fullNameReporter;
                    this.dateOfReport = dateOfReport;
                }
            }
        }
    }

    public FinanceReport(FinanceReport financeReport) {
        this.fullNameReporter = new String(financeReport.getFullNameReporter());
        this.dateOfReport = financeReport.dateOfReport;
        paymentsArray = new Payment[financeReport.length()];
        for (int i = 0; i < financeReport.length(); i++) {
            Payment payment = financeReport.getPayment(i);
            paymentsArray[i] = new Payment(payment.getFullName(), payment.getDateOfPayment(), payment.getSum());
        }
    }

    public Payment getPayment(int index) {
        if (index < 0 || index >= this.countOfPayments()) {
            throw new ArrayIndexOutOfBoundsException("FinanceReport getPayment: index less than 0!");
        } else {
            return paymentsArray[index];
        }
    }

    public void setPayment(int index, Payment payment) {
        if (index < 0 || index >= this.countOfPayments()) {
            throw new IllegalArgumentException("FinanceReport setPayment: index less than 0!");
        } else {
            if (payment == null) {
                throw new IllegalArgumentException("FinanceReport setPayment: payment argument is null!");
            } else {
                paymentsArray[index] = payment;
            }
        }
    }

    public String getFullNameReporter() {
        return this.fullNameReporter;
    }

    public int length() {
        return paymentsArray.length;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append(String.format("[Автор: %s, дата: %d-%d-%d, Платежи: [\n", this.fullNameReporter, this.dateOfReport.getDay(), this.dateOfReport.getMonthNum(), this.dateOfReport.getYear()));
        for (int i = 0; i < countOfPayments(); i++) {
            if (this.paymentsArray[i] != null) {
                stringBuilder.append(this.paymentsArray[i].toString());
                stringBuilder.append("\n");
            }
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

}
