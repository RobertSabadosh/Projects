package homeworks;

import static homeworks.UniversalMethod.split;

public class Homework26 {

    public static void main(String[] args) {

        System.out.println(starOut("ab*cd")); // "ad"
        System.out.println(starOut("ab**cd")); // "ad"
        System.out.println(starOut("sm*eilly")); // "silly"
        split();
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
    }

    /*Return a version of the given string, where for every star () in the string the star and the chars immediately to its left and right
    are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".*/
    public static String starOut(String str) {
        String output = "";
        char star = '*';

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == star && str.charAt(i - 1) != star) {

                output = str.substring(0, i - 1) + str.substring(i + 2);
            } else if (str.charAt(i) == star && str.charAt(i - 1) == star) {
                output = str.substring(0, i - 2) + str.substring(i + 2);
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
