package lesson46;

import static homeworks.UniversalMethod.split;

public class StringExercises {

    public static void main(String[] args) {

        System.out.println(getSandwich("breadjambread")); // "jam"
        System.out.println(getSandwich("xxbreadjambreadyy")); // "jam"
        System.out.println(getSandwich("xxbreadyy"));  // ""

        split();

    }

    /*A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
    appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.*/
    public static String getSandwich(String str) {
        String result = "";
        int count = 0;
        for (int i = 0; i < str.length() - 5; i ++) {
            String temp = str.substring(i, i + 5);
            if (temp.contains("bread")) {
                count++;
            }
            if (str.charAt(i) == 'd' && temp.contains("bread")) {
                result = str.substring(str.indexOf('d'));
            }
        }
        if (count < 2) {
            return result;
        }
        return result;
    }
}
