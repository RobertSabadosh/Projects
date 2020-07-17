package homeworks;

import static homeworks.UniversalMethod.split;

public class Homework15 {

    public static void main(String[] args) {

        System.out.println(ItIsInside("Hi")); // true
        System.out.println(ItIsInside("Haaaaai")); // false
        System.out.println(ItIsInside("Ola")); // false
        split();
        System.out.println(lastWord("Spider-man")); // true
        System.out.println(lastWord("Superman"));   // true
        System.out.println(lastWord("Batgirl"));   // false
        split();
        System.out.println(hasBad("badxx")); // true
        System.out.println(hasBad("xbadxx")); // true
        System.out.println(hasBad("xxbadxx")); // false
        split();
        System.out.println(ignoreCase("I LOVE JAVA", "i love java")); // true
        System.out.println(ignoreCase("I love java", "I love javascript")); // false
        System.out.println(ignoreCase("I lOvE JaVa", "i LoVe jAvA")); // true
        split();
        System.out.println(empty("    ")); // false
        System.out.println(empty("")); // true
        System.out.println(empty("Hello World!")); // false
        split();
        System.out.println(numberOfCharacters("I`ll be back!!!")); // 15
        System.out.println(numberOfCharacters("Oh, hi Mark!")); // 12
        System.out.println(numberOfCharacters(""));  //0
        split();
        System.out.println(replace());
        split();
        System.out.println(mainWord("Hola hermano!")); // true
        System.out.println(mainWord("Ola ermano!")); // false
        System.out.println(mainWord("Hi brother")); // false
        split();
        System.out.println(left2("Hello")); // "lloHe"
        System.out.println(left2("java")); // "vaja"
        System.out.println(left2("Hi")); // "Hi"
        split();
        System.out.println(caseChangeOne());
        split();
        System.out.println(caseChangeTwo());
        split();
        System.out.println(cutOffIndention());


    }

    public static boolean ItIsInside(String str) {
        String result = "Hi";

        return str.contains(result);
    }

    public static boolean lastWord(String str) {
        String start = "man";

        return str.endsWith(start);
    }

    public static boolean hasBad(String str) {
        String start = "bad";

        if (str.length() < 3) {
            return false;
        }
        if (str.substring(0, 3).equals(start)) {
            return true;
        }
        return str.length() > 3 && str.substring(1, 4).equals(start);
    }

    public static boolean ignoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public static boolean empty(String str) {
        return str.isEmpty();
    }

    public static int numberOfCharacters(String str) {
        return str.length();
    }

    public static String replace() {
        String str = "My name is Khan my name is Java";
        return str.replace("is", "was");
    }

    public static boolean mainWord(String str) {
        String start = "Hola";
        return str.startsWith(start);
    }

    public static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public static String caseChangeOne() {
        String str1 = "I LOVE JAVA!!!";
        String str2 = "I`LL BE back";
        String str3 = "How can I help You?";
        return str1.toLowerCase() + '\n' + str2.toLowerCase() + '\n' + str3.toLowerCase();
    }

    public static String caseChangeTwo() {
        String str1 = "i love java!!!!!";
        String str2 = "I`LL BE back";
        String str3 = "How can I help You?";
        return str1.toUpperCase() + '\n' + str2.toUpperCase() + '\n' + str3.toUpperCase();
    }

    public static String cutOffIndention() {
        String str1 = "   Hello world!!!  ";
        String str2 = "   Hello world!!!  ";
        return str1 + '\n' + str2.trim();
    }
}
