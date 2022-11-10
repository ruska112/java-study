package com.ruska112.lab2;

import java.util.ArrayList;

public class RearrangeWords {
    public static String rearrangeWords(String string) {
        StringBuffer seq = new StringBuffer(string);
        ArrayList<String> result = new ArrayList<>();
        boolean flag = true;
        int i, j, spaceLen, wordLen;
        i = 0;
        j = string.length() - 1;
        spaceLen = 0;
        wordLen = 0;

        if (seq.charAt(0) == ' ') {
            flag = false;
        }

        while (i < string.length() || j > 0) {
            if (!flag) {
                if (seq.charAt(i) == ' ') {
                    spaceLen++;
                    if (i + 1 != string.length()) {
                        if (seq.charAt(i + 1) != ' ') {
                            result.add(seq.substring(i + 1 - spaceLen, i + 1));
                            flag = true;
                            spaceLen = 0;
                        }
                    } else {
                        result.add(seq.substring(i + 1 - spaceLen, string.length()));
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

        return str.toString();
    }
}
