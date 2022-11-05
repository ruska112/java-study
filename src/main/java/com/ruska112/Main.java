package com.ruska112;

import com.ruska112.lab2.*;
import com.ruska112.sem4.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Human> people = new ArrayList<>();
        people.add(new Human("Ded", new MyDate(2002, 3, 18)));
        people.add(new Human("Hard", new MyDate(2000, 5, 14)));
        people.add(new Human("Ded", new MyDate(2013, 8, 11)));

        ArrayList<Human> result = new ArrayList<>();
        result.add(new Human("Ded", new MyDate(2002, 3, 18)));
        result.add(new Human("Hard", new MyDate(2000, 5, 14)));

        ArrayList<Human> adults = HumanService.getAllAdults(people);

        System.out.println(adults.get(0).getFullName() + " " + adults.get(0).getBirthday().getYear() + " " + adults.get(0).getBirthday().getMonthNum() + " " + adults.get(0).getBirthday().getDay());
        System.out.println(result.get(0).getFullName() + " " + result.get(0).getBirthday().getYear() + " " + result.get(0).getBirthday().getMonthNum() + " " + result.get(0).getBirthday().getDay());

        System.out.println(adults.get(1).getFullName() + " " + adults.get(1).getBirthday().getYear() + " " + adults.get(1).getBirthday().getMonthNum() + " " + adults.get(1).getBirthday().getDay());
        System.out.println(result.get(1).getFullName() + " " + result.get(1).getBirthday().getYear() + " " + result.get(1).getBirthday().getMonthNum() + " " + result.get(1).getBirthday().getDay());
    }
}
