package dev.karabalin.sem4;

import java.util.HashMap;
import java.util.Map;

public class Date {
    private int day;
    private String month;
    private int year;

    Map<Integer, String> months = new HashMap<Integer, String>();
    Map<String, Integer> monthsNum = new HashMap<String, Integer>();
    {
        months.put(1, "january");
        months.put(2, "february");
        months.put(3, "march");
        months.put(4, "april");
        months.put(5, "may");
        months.put(6, "june");
        months.put(7, "july");
        months.put(8, "august");
        months.put(9, "september");
        months.put(10, "october");
        months.put(11, "november");
        months.put(12, "december");
    }

    {
        monthsNum.put("january", 1);
        monthsNum.put("february", 2);
        monthsNum.put("march", 3);
        monthsNum.put("april", 4);
        monthsNum.put("may", 5);
        monthsNum.put("june", 6);
        monthsNum.put("july", 7);
        monthsNum.put("august", 8);
        monthsNum.put("september", 9);
        monthsNum.put( "october", 10);
        monthsNum.put( "november", 11);
        monthsNum.put( "december", 12);
    }

    public Date() {
        day = 21;
        month = "August";
        year = 7;
    }

    public Date(int day, String month, int year) {
        if (year > 0 && year <= 2200) {
            this.year = year;
            if (month.equalsIgnoreCase(months.get(1)) ||
                    month.equalsIgnoreCase(months.get(3)) ||
                    month.equalsIgnoreCase(months.get(5)) ||
                    month.equalsIgnoreCase(months.get(7)) ||
                    month.equalsIgnoreCase(months.get(8)) ||
                    month.equalsIgnoreCase(months.get(10)) ||
                    month.equalsIgnoreCase(months.get(12))) {
                this.month = month;
                if (day >= 1 && day <= 31) {
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Day error");
                }
            } else if (month.equalsIgnoreCase(months.get(4)) ||
                    month.equalsIgnoreCase(months.get(6)) ||
                    month.equalsIgnoreCase(months.get(9)) ||
                    month.equalsIgnoreCase(months.get(11))) {
                this.month = month;
                if (day >= 1 && day <= 30) {
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Day error");
                }
            } else if (month.equalsIgnoreCase(months.get(2))) {
                this.month = month;
                if (day >= 1 && day <= 28) {
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Day error");
                }
            } else {
                throw new IllegalArgumentException("Month error");
            }
        } else {
            throw new IllegalArgumentException("Year error");
        }
    }

    public Date(int day, int month, int year) {
        if (year > 0 && year <= 2200) {
            this.year = year;
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                this.month = months.get(month).toLowerCase();
                if (day >= 1 && day <= 31) {
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Day error");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                this.month = months.get(month).toLowerCase();
                if (day >= 1 && day <= 30) {
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Day error");
                }
            } else if (month == 2) {
                this.month = months.get(month).toLowerCase();
                if (day >= 1 && day <= 28) {
                    this.day = day;
                } else {
                    throw new IllegalArgumentException("Day error");
                }
            } else {
                throw new IllegalArgumentException("Month error");
            }
        } else {
            throw new IllegalArgumentException("Year error");
        }
    }

    public void setDay(int day) throws IllegalArgumentException {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Day error");
        }
    }

    public void setMonth(String month) throws IllegalArgumentException {
        if (months.containsValue(month.toLowerCase())) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Month error");
        }
    }

    public void setMonth(int month) throws IllegalArgumentException {
        if (month >= 1 && month <= 12) {
            this.month = months.get(month).toLowerCase();
        } else {
            throw new IllegalArgumentException("Month error");
        }
    }

    public void setYear(int year) throws IllegalArgumentException {
        if (year >= 0 && year <= 2200) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year error");
        }
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isBeforeNow(Date date) {
        return (date.day < this.day) && (monthsNum.get(date.month.toLowerCase()) <= monthsNum.get(this.month.toLowerCase())) && (date.year <= this.year);
    }
}
