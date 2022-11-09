package com.ruska112.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeWords {
    public static String rearrangeWords(String string) {
        return new String();
    }

    public static void main(String[] args) {
        String words = new String(" a  ab   abc");
        StringBuffer seq = new StringBuffer(words);
        System.out.println(seq.toString());
        int i = 1;
        int j = 0;
        while (i < words.length() - 1) {
            if (seq.substring(i, i + 1).equals(" ") && seq.substring(i - 1, i).equals(" ")) {
                j++;
            }
            if (!seq.substring(i, i + 1).equals(" ") && seq.substring(i - 1, i).equals(" ")) {
                StringBuffer space = new StringBuffer();
                space.append(" ".repeat(Math.max(0, j - 1)));
                space.append(".");
                seq.insert(i, space);
                j = 0;
            }

            i++;
        }

        System.out.println(seq.toString());
    }
}
