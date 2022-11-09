package com.ruska112.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeWords {
    public static String rearrangeWords(String string) {
        return new String();
    }

    public static void main(String[] args) {
        String[] words = new String(" a  ab   abc").split("");
        ArrayList<String> wordsArr = new ArrayList<>(List.of(words));
        System.out.println(wordsArr.toString());

        for (int i = 0; i < wordsArr.size() - 1; i++) {
            if (wordsArr.get(i + 1).equals(" ")) {
                wordsArr.add(wordsArr.get(i) + wordsArr.get(i+1));
                wordsArr.remove(i);
                wordsArr.remove(i+1);
            }
        }
        System.out.println(wordsArr.toString());
    }
}
