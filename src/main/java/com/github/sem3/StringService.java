package org.example.my;

public class StringService {
    public static int getCountOfStringsStartsWith(String[] array, char c) {
        int result = 0;
        String string = String.valueOf(c);
        for (String str : array) {
            if (string.equals(String.valueOf(str.charAt(0)))) {
                result++;
            }
        }
        return result;
    }

    public static int getCountOfStringsEquals(String[] array, String string) {
        int result = 0;
        for (String str : array) {
            if (string.equals(str)) {
                result++;
            }
        }
        return result;
    }

    public static int getCountOfStringsWithoutSubstring(String[] array, String string) throws IllegalArgumentException {
        int result = 0;
        if (!"".equals(string) && string != null) {
            for (String value : array) {
                for (int j = 0; j < value.length() - string.length() + 1; j++) {
                    if ((value.startsWith(string, j))) {
                        result++;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("String is empty");
        }
        return result;
    }
}
