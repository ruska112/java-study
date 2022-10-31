package com.ruska112.lab2;

public class Payment {
    private String fullName;
    private int day;
    private int month;
    private int year;
    private int sum;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Day");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Month");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2022) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year");
        }
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        if (sum >= 0) {
            this.sum = sum;
        } else {
            throw new IllegalArgumentException("Sum");
        }
    }

    public void setFullName(String fullName) {
        if (!"".equals(fullName)) {
            this.fullName = fullName;
        } else {
            throw new IllegalArgumentException("FullName");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public Payment(String fullName, int day, int month, int year, int sum) {
        setFullName(fullName);
        setDay(day);
        setMonth(month);
        setYear(year);
        setSum(sum);
    }

    public boolean equals(Payment payment) {
        if (payment != null) {
            return this.fullName.equals(payment.getFullName())
                    && this.sum == payment.getSum()
                    && this.day == payment.getDay()
                    && this.month == payment.getMonth()
                    && this.year == payment.getYear();
        } else {
            return false;
        }
    }

    public String toString() {
        return String.format("ФИО: %s, Дата: %d-%d-%d, %d руб. %d коп.", this.fullName, this.day, this.month, this.year, (this.sum / 100), (this.sum % 100));
    }
}
