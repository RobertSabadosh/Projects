package lesson17;

import static homeworks.UniversalMethod.split;

public class StringExercise {

    public static void main(String[] args) {

        System.out.println(left2("Hello")); // "lloHe"
        System.out.println(left2("java")); // "vaja"
        System.out.println(left2("Hi")); // "Hi"
        split();
    }

    public static String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0,2);
    }


}
