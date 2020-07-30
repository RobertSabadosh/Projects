package lesson26;

import static homeworks.UniversalMethod.split;

public class Classwork {

    public static void main(String[] args) {

//        System.out.println(countYZ("fez day")); // 2
//        System.out.println(countYZ("day fez")); // 2
//        System.out.println(countYZ("day fyyyz")); // 2
//        System.out.println(countYZ("tel ran")); // 0
//        System.out.println(countYZ("xyx xzy")); // 1
//        System.out.println(countYZ("London is the capital of Great Britain")); // 0
//        split();
//        System.out.println(gHappy("xxggxx")); // true
//        System.out.println(gHappy("xxgxx")); // false
//        System.out.println(gHappy("xxggyygxx")); // false
        split();
        System.out.println(sameStarChar("xy*yzz")); // true
        System.out.println(sameStarChar("xy*zzz")); // false
        System.out.println(sameStarChar("*xa*az")); // true
        split();
//        System.out.println(starOut("ab*cd")); // "ad"
//        System.out.println(starOut("ab**cd")); // "ad"
//        System.out.println(starOut("sm*eilly")); // "silly"

    }

    /*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y'
    in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately
    following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)*/
    public static int countYZ(String str) {
        int wordsNumber = 0;
        for (int i = 1; i < str.length(); i++) {
            // if (str.charAt(i) == ' ' && (str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'z')) {
            char tempChar = str.charAt(i);
            if (!Character.isLetter(tempChar) && (str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'z')) {
                wordsNumber++;
            }
        }
        if (str.endsWith("y") || str.endsWith("z")) {
            wordsNumber++;
        }
        return wordsNumber;
    }

    /*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the
    g's in the given string are happy.*/
    public static boolean gHappy(String str) {
        int count = 0;
        int allG = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                allG++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' && (str.charAt(i - 1) != 'g' || str.charAt(i + 1) != 'g')) {
                count++;
                return true;
            }
        }
        if (count != allG)
            return true;
        return false;
    }

    /*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the
    same*/
    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) == str.charAt(i + 1)) {
                /*if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                    return false;*/
                return true;
            }
        }
        return false;
    }

    /*Return a version of the given string, where for every star () in the string the star and the chars immediately to its left and right
    are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".*/
    public static String starOut(String input) {
        String output = "";

        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) == '*') {
                // output = output + input.charAt(i - 1) + input.charAt(i) + input.charAt(i + 1);
                output = input.substring(0, (i - 1)) + input.substring(i + 2);
            }
        }
        // input == input.substring() - output;
        return output;
    }
}