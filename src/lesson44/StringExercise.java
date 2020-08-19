package lesson44;

import static homeworks.UniversalMethod.split;

public class StringExercise {

    public static void main(String[] args) {

        System.out.println(withoutEnd2("Hello")); // "ell"
        System.out.println(withoutEnd2("abc")); // "b"
        System.out.println(withoutEnd2("ab")); // ""
        System.out.println(withoutEnd2("a")); // ""
        System.out.println(withoutEnd2("")); // ""

        split();

        System.out.println(nTwice("Hello", 2)); // "Helo"
        System.out.println(nTwice("Chocolate", 3)); // "Choate"
        System.out.println(nTwice("Chocolate", 1)); // "Ce"
        System.out.println(nTwice("Василий", 2)); // "Ваий"
        System.out.println(nTwice("Tel-Ran", 7));

        split();

        System.out.println(xyBalance1("aaxbby")); // true
        System.out.println(xyBalance1("aaxbb")); // false
        System.out.println(xyBalance1("yaaxbb")); // false

        split();

        System.out.println(xyBalance("aaxbby")); // true
        System.out.println(xyBalance("aaxbb")); // false
        System.out.println(xyBalance("yaaxbb")); // false

        split();

        System.out.println(repeatFront("Chocolate", 4)); // "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3)); // "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2)); // "IcI"
    }

    //Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
    public static String withoutEnd2(String str) {
        if (str.length() < 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    /*Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least
    n.*/
    public static String nTwice(String str, int n) {
        String output;
        output = str.substring(0, n) + str.substring(str.length() - n);
        return output;
    }

    /*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
    So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.*/
    public static boolean xyBalance1(String str) {
        char x = 'x';
        char y = 'y';
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == x) {
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean xyBalance(String str) {
        int x = str.indexOf('x');
        return str.substring(x).contains("y");
    }

    /*Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of
    the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <=str.length()).*/
    public static String repeatFront(String str, int n) {
        String output = "";
        for (int i = n; i > 0; i--) {
            output += str.substring(0, i);
        }
        return output;
    }
}
