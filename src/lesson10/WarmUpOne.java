package lesson10;

public class WarmUpOne {

    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));// expecting true
        System.out.println(sleepIn(true, false));// expecting false
        System.out.println(sleepIn(false, true));//expecting true
        split();
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        split();
        System.out.println(missingChar("kitten", 1)); // expecting "ktten"
        System.out.println(missingChar("kitten", 0)); // expecting "itten"
        System.out.println(missingChar("kitten", 4)); // expecting "kittn"
        split();
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }

    public static void split() {
        System.out.println("---------------------------------");
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static double diff21(int n) {
        if (n > 21) {
            return n - (21 * 2);
        } else {
            return Math.abs(n - 21);
        }
    }

    public static String missingChar(String s, int n) {
        String output = "";
        output = s.substring(0, n) + s.substring(n + 1);
        return output;
    }

    public static String backAround(String str) {
        String output = "";
        int lastSymbol = str.length() - 1;
        output = str.substring(lastSymbol);
        return output + str + output;
    }
}
