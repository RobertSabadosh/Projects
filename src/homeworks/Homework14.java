package homeworks;

public class Homework14 {

    public static void main(String[] args) {

        System.out.println(minCat("Hello", "Hi")); // expecting "loHi"
        System.out.println(minCat("Hello", "java")); // expecting "ellojava"
        System.out.println(minCat("java", "Hello")); // expecting "javaello"
        split();
        System.out.println(doubleChar("The")); // expecting "TThhee"
        System.out.println(doubleChar("AAbb")); // expecting "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // expecting "HHii--TThheerree"
        split();
        System.out.println(loneSum(1, 2, 3)); // expecting 6
        System.out.println(loneSum(3, 2, 3)); // expecting 2
        System.out.println(loneSum(3, 3, 3)); // expecting 0
        split();
        System.out.println(digitsSum(123)); // expecting 6
        System.out.println(digitsSum(768)); // expecting 21
        split();
        System.out.println(digitsSum2(123));
        System.out.println(digitsSum2(768));

    }

    public static String minCat(String str1, String str2) {
        if (str1.length() <= str2.length()) {
            return str1 + str2.substring(str2.length() - str1.length());
        }
        return str1.substring(str1.length() - str2.length()) + str2;
    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    public static int loneSum(int a, int b, int c) {
        int sum = a + b + c;

        if (a == b && b == c) {
            sum = 0;
        } else if (b == c) {
            sum = a;
        } else if (a == c) {
            sum = b;
        } else if (a == b) {
            sum = c;
        }
        return sum;
    }

    public static int digitsSum(int number) {

        int sum = 0;
        int currentDigit;

        for (int i = 1; i <= number; i++) {
            currentDigit = number % 10;
            sum += currentDigit;
            number = number / 10;
        }
        return sum + number;
    }

    public static int digitsSum2(int number) {
        return ((number % 10) + (number / 10 % 10) + (number / 100));
    }

    public static void split() {
        System.out.println("--------------------------");
    }
}
