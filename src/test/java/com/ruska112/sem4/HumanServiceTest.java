package com.ruska112.sem4;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HumanServiceTest {
    @Test
    public void getAllAdultsTest() {
        ArrayList<Human> people = new ArrayList<>();
        people.add(new Human("Ded", new MyDate(2002, 3, 18)));
        people.add(new Human("Hard", new MyDate(2000, 5, 14)));
        people.add(new Human("Ded", new MyDate(2013, 8, 11)));

        ArrayList<Human> result = new ArrayList<>();
        result.add(new Human("Ded", new MyDate(2002, 3, 18)));
        result.add(new Human("Hard", new MyDate(2000, 5, 14)));

        ArrayList<Human> adults = HumanService.getAllAdults(people);

        // assert to ArrayList?
    }
}