package lesson20;

public class Exercises20 {

    public static void main(String[] args) {
        //multiplicationTable(3);
        //printLeapYear(2000, 2009);
        //System.out.println(countLeapYears(2000, 2009));
        printDivisors(32);
    }

    public static void multiplicationTable(int digit) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result = "" + digit + "*" + i + "=" + digit * i;
            System.out.println(result);
        }
    }

    public static void printLeapYear(int yearOne, int yearTwo) {
        for (int i = yearOne; i <= yearTwo; i++) {
            if (leapYear(i)) {
                System.out.println(i);
            }
        }
    }

    public static int countLeapYears(int yearOne, int yearTwo) {
        int count = 0;
        for (int i = yearOne; i < yearTwo; i++) {
            if (leapYear(i)) {
                count++;
            }
        }
        return count;
    }

    public static void printDivisors(int n) {
        int count = 0;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total divisors: " + count);
    }

    public static boolean leapYear(int year) {

        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
