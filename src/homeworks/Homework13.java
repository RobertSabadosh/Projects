package homeworks;

public class Homework13 {

    public static void main(String[] args) {

        int year1 = 1700;
        int year2 = 2020;

        isLeapYear(year1);
        isLeapYear(year2);
        split();
        primeNumbers();
        split();
        evenNumbers();
        split();
        findMagicNumber();
    }

    public static void isLeapYear(int year) {
        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void primeNumbers() {
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    count++;
            }
            if (count < 2)
                System.out.println(i);
        }
    }

    public static void evenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void findMagicNumber() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }
    }

    public static void split() {
        System.out.println("-----------------------------");
    }
}
