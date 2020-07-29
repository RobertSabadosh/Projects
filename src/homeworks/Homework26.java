package homeworks;

import static homeworks.UniversalMethod.split;

public class Homework26 {

    public static void main(String[] args) {

        System.out.println(sameStarChar("xy*yzz")); // true
        System.out.println(sameStarChar("xy*zzz")); // false
        System.out.println(sameStarChar("*xa*az")); // true
        split();
        System.out.println(starOut("ab*cd")); // "ad"
        System.out.println(starOut("ab**cd")); // "ad"
        System.out.println(starOut("sm*eilly")); // "silly"
        split();
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
    }

    /*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the
    same*/
    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }
        return true;
    }

    /*Return a version of the given string, where for every star () in the string the star and the chars immediately to its left and right
    are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".*/
    public static String starOut(String str) {
        String output = "";

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                output = str.substring(0, (i - 1)) + str.substring(i + 2);
            }
        }
        return output;
    }

    //Return the number of times that the string "hi" appears anywhere in the given string.
    public static int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
                count++;
        }
        return count;
    }
}