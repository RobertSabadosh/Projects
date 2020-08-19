package lesson18;

import static homeworks.UniversalMethod.split;

public class StringExercise {

    public static void main(String[] args) {

        System.out.println(left2("Hello")); // "lloHe"
        System.out.println(left2("java")); // "vaja"
        System.out.println(left2("Hi")); // "Hi"
        split();
        System.out.println(withoutEnd2("Hello")); // "ell"
        System.out.println(withoutEnd2("abc"));// "b"
        System.out.println(withoutEnd2("ab")); // ""
        split();
        System.out.println(nTwice("Hello", 2)); // "Helo"
        System.out.println(nTwice("Chocolate", 3)); // "Choate"
        System.out.println(nTwice("Chocolate", 1)); // "Ce"
        split();
        System.out.println(hasBad("badxx")); // true
        System.out.println(hasBad("xbadxx")); // true
        System.out.println(hasBad("xxbadxx")); // false
        split();
        System.out.println(plusOut("12xy34", "xy")); // "++xy++"
        System.out.println(plusOut("12x34", "1")); // "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); // "++xy++xy+++xy"
        split();
        System.out.println(countCode("aaacodebbb")); // 1
        System.out.println(countCode("codexxcode")); // 2
        System.out.println(countCode("cozexxcope")); // 2
    }

    public static String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public static String withoutEnd2(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String nTwice(String s, int n) {

        return s.substring(0, n) + s.substring(s.length() - n);
    }

    public static boolean hasBad(String s) {
        String inside = "bad";
        return s.contains(inside);
    }

    public static String plusOut(String bigWord, String shortWord) {
        String res = "";
        for (int i = 0; i < bigWord.length(); i++) {
            for (int j = 0; j < shortWord.length(); j++) {
                System.out.println(i + j + " " + (bigWord.charAt(i) == shortWord.charAt(j)));
            }
        }
        return "";
    }

    public static void test(){
        String input = "test";
        String etalon = "te";
        input = input + input.contains(etalon.substring(0,1));
        System.out.println(input);
    }

    public static int countCode(String input){
        String benchmark = "code";
        char c0 = 'c';
        char c1 = 'o';
        char c3 = 'e';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c0 && input.charAt(i+1) == c1 && input.charAt(i+3) == c3){
                count ++;
            }
        }
        return count;
    }
}
