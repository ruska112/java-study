package com.ruska112.lab2;

public class FinanceReport {
    Payment[] paymentsArray;
    String fullNameReporter;
    private int day;
    private int month;
    private int year;

    public FinanceReport(int length, String fullNameReporter, int day, int month, int year) {
        paymentsArray = new Payment[length];
        this.fullNameReporter = fullNameReporter;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int length() {
        return paymentsArray.length;
    }

    public String getPayment(int index) {
        if (index >= 0 && index <= paymentsArray.length) {
            return paymentsArray[index].toString();
        } else {
            throw new IndexOutOfBoundsException("Index error");
        }
    }

    public void setPayment(int index, String fullName, int day, int month, int year, int sum) {
        if (index >= 0 && index <= paymentsArray.length) {
            paymentsArray[index] = new Payment(fullName, day, month, year, sum);
        } else {
            throw new IndexOutOfBoundsException("Index error");
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append(String.format("[Автор: %s, дата: %d-%d-%d, Платежи: [\n", fullNameReporter, day, month, year));
        for (int i = 0; i < length(); i++) {
            if (paymentsArray[i] != null) {
                stringBuilder.append(paymentsArray[i].toString());
                stringBuilder.append("\n");
            }
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

}
