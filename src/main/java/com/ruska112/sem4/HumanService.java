package com.ruska112.sem4;

import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;

public class HumanService {
    public static ArrayList<Human> getAllAdults(ArrayList<Human> people) {
        ArrayList<Human> adults = new ArrayList<>();
        if (people.isEmpty()) {
            throw new IllegalArgumentException("HumanService getAllAdults: people parameter is empty!");
        } else {
            MyDate adultDate = new MyDate(Year.now().getValue() - 18, YearMonth.now().getMonthValue(), MonthDay.now().getDayOfMonth());
            for (Human human : people) {
                if (human.getBirthday().isBefore(adultDate)) {
                    adults.add(human);
                }
            }
            return adults;
        }
    }
}
