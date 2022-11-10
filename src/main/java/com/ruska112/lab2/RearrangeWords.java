package com.ruska112.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeWords {
    public static String rearrangeWords(String string) {
        return new String();
    }

    public static void main(String[] args) {
        String input = new String(" a  bb   ccc    ");
        StringBuffer seq = new StringBuffer(input);
        ArrayList<String> result = new ArrayList<>();
        boolean flag = true;
        int i, j, spaceLen, wordLen, n;
        i = 0;
        j = input.length() - 1;
        spaceLen = 0;
        wordLen = 0;
        n = input.length();

        if (seq.charAt(0) == ' ') {
            flag = false;
        } else {
            flag = true;
        }

        while (i < n || j > 0) {
            if (!flag) {
                if (seq.charAt(i) == ' ') {
                    spaceLen++;
                    if (i + 1 != n) {
                        if (seq.charAt(i + 1) != ' ') {
                            result.add(seq.substring(i + 1 - spaceLen, i + 1));
                            flag = true;
                            spaceLen = 0;
                        }
                    } else {
                        result.add(seq.substring(i + 1 - spaceLen, n));
                        flag = true;
                    }
                }
                i++;
            }
            if (flag) {
                if (seq.charAt(j) != ' ') {
                    wordLen++;
                    if (j - 1 != -1) {
                        if (seq.charAt(j - 1) == ' ') {
                            result.add(seq.substring(j, j + wordLen));
                            flag = false;
                            wordLen = 0;
                        }
                    } else {
                        result.add(seq.substring(j, j + wordLen));
                        flag = false;
                    }
                }
                j--;
            }
        }

        StringBuffer str = new StringBuffer();
        for (String s : result) {
            str.append(s);
        }

        System.out.println(str.toString());
    }
}
