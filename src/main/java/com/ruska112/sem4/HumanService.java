package com.ruska112.sem4;

import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class HumanService {
    public static Human[] getAllAdults(Human[] people) {
        if (people != null) {
            Human[] adults = new Human[people.length];
            MyDate adultDate = new MyDate(MonthDay.now().getDayOfMonth(), YearMonth.now().getMonthValue(), Year.now().getValue() - 18);
            for (int i = 0; i < people.length; i++) {
                Human p = people[i];
                if (p.getBirthday().isBefore(adultDate)) {
                    adults[i] = new Human(p.getFullName(), p.getBirthday());
                }
            }
            return adults;
        } else {
            throw new IllegalArgumentException("array is null");
        }
    }

    public static int[] getAges(Human[] people) {
        if (people != null) {
            int[] ages = new int[people.length];
            MyDate nowDate = new MyDate(MonthDay.now().getDayOfMonth(), YearMonth.now().getMonthValue(), Year.now().getValue());
            for (int i = 0; i < people.length; i++) {
                Human p = people[i];
                ages[i] = (nowDate.getYear() - p.getBirthday().getYear());
            }
            return ages;
        } else {
            throw new IllegalArgumentException("array is null");
        }
    }
}
