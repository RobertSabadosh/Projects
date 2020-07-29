package homeworks;

import static homeworks.UniversalMethod.split;

public class Homework24 {

    public static void main(String[] args) {

        System.out.println(blueTicket(9, 1, 0));// 10
        System.out.println(blueTicket(9, 2, 0)); // 0
        System.out.println(blueTicket(6, 1, 4)); // 10
        System.out.println(blueTicket(13, 7, 3)); // 5
        split();
        System.out.println(dateFashion(5, 10)); // 2
        System.out.println(dateFashion(5, 2)); // 0
        System.out.println(dateFashion(5, 5)); // 1
        split();
        System.out.println(sortaSum(3, 4)); // 7
        System.out.println(sortaSum(9, 4)); // 20
        System.out.println(sortaSum(10, 11)); // 21
    }

    public static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == bc + 10 || ab == ac + 10) {
            return 5;
        } else if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }
        return 0;
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }

    public static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        }
        return a + b;
    }
}