package lesson51;

import static homeworks.UniversalMethod.split;

public class RecursionExercises01 {

    public static void main(String[] args) {

        System.out.println(endX("xxxre")); // "rexxx"
        System.out.println(endX("xxhixx")); // "hixxxx"
        System.out.println(endX("xhixhix")); // "hihixxx"
        split();
        System.out.println(count11("11abc11")); // 2
        System.out.println(count11("abc11x11x11")); // 3
        System.out.println(count11("111")); // 1
        split();
        System.out.println(parenBit("xyz(abc)123")); // "(abc)"
        System.out.println(parenBit("x(hello)")); // "(hello)"
        System.out.println(parenBit("(xy)1")); // "(xy)"
        split();
        System.out.println(strCopies("catcowcat", "cat", 2)); // true
        System.out.println(strCopies("catcowcat", "cow", 2)); // false
        System.out.println(strCopies("catcowcat", "cow", 1)); // true
    }

    //Given a string, compute recursively a new string where all the lowercase ‘x’ chars have been moved to the end of the string.
    public static String endX(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    //Given a string, compute recursively (no loops) the number of “11” substrings in the string. The “11” substrings should not overlap.
    public static int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    /*Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the
    parenthesis and their contents, so “xyz(abc)123” yields “(abc)”.*/
    public static String parenBit(String input) {
        if (input.length() == 0) {
            return "";
        }
        if (input.charAt(0) != '(') {
            return parenBit(input.substring(1));
        } else if (input.charAt(input.length() - 1) != ')') {
            return parenBit(input.substring(0, input.length() - 1));
        }
        return input;
    }

    /*Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string
    somewhere, possibly with overlapping. N will be non-negative.*/
    public static boolean strCopies(String input, String etalon, int count) {
        if (count == 0) {
            return true;
        }
        if (input.length() < etalon.length()) {
            return false;
        }
        if (input.substring(0, etalon.length()).equals(etalon)) {
            return strCopies(input.substring(1), etalon, count - 1);
        }
        return strCopies(input.substring(1), etalon, count);
    }
}
