package lesson47;

import static homeworks.UniversalMethod.split;

public class StringExercise02 {

    public static void main(String[] args) {

        System.out.println(zipZapOld("zipXzap")); // "zpXzp"
        System.out.println(zipZapOld("zopzop")); // "zpzp"
        System.out.println(zipZapOld("zzzopzop")); // "zzzpzp"

        split();

        System.out.println(zipZap("ziyupXzap")); // "zpXzp"
        System.out.println(zipZap("zopzop")); // "zpzp"
        System.out.println(zipZap("zzzopzop")); // "zzzpzp"

        split();

        System.out.println(wordEnds("abcXY123XYijk", "XY")); // "c13i"
        System.out.println(wordEnds("XY123XY", "XY")); // "13"
        System.out.println(wordEnds("XY1XY", "XY")); // "11"

        split();

        System.out.println(wordEndsOld("abcXY123XYijk", "XY")); // "c13i"
        System.out.println(wordEndsOld("XY123XY", "XY")); // "13"
        System.out.println(wordEndsOld("XY1XY", "XY")); // "11"

    }

    /*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for
    all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".*/
    public static String zipZapOld(String str) {
        return str.replaceAll("z.p", "zp");
    }

    public static String zipZap(String str) {
        String z = "";
        String p = "";
        String temp = "";
        for (int i = 0; i < str.length() - 2; i++) {
            temp = str.substring(i, i + 3);
            if (temp.charAt(0) == 'z' && temp.charAt(2) == 'p') {
                z = str.substring(0, i + 1);
                p = str.substring(i + 2);
                str = z + p;
            }
        }
        return str;
    }

    /*Given a string and a non-empty word string, return a string made of each char just before and just after every appearance
    of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it
    is between two words*/
    public static String wordEndsOld(String str, String strChar) {
        String result = "";
        int start = str.length();
        int end = strChar.length();
        for (int i = 0; i < start - end + 1; i++) {
            String temp = str.substring(i, i + end);
            if (i > 0 && temp.equals(strChar)) {
                result += str.substring(i - 1, i);
            }
            if (i < start - end && temp.equals(strChar)) {
                result += str.substring(i + end, i + end + 1);
            }
        }
        return result;
    }

    public static String wordEnds(String a, String b) {

        return "";
    }
}
