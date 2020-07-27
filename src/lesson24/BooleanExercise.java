package lesson24;

import static homeworks.UniversalMethod.split;

public class BooleanExercise {

    public static void main(String[] args) {

        System.out.println(nearTen(12)); // true
        System.out.println(nearTen(17)); // false
        System.out.println(nearTen(19)); // true
        split();
        System.out.println(teaParty(6, 8)); // 1
        System.out.println(teaParty(3, 8)); // 0
        System.out.println(teaParty(20, 6)); // 2
        split();
        System.out.println(twoAsOne(1, 2, 3)); // true
        System.out.println(twoAsOne(3, 1, 2)); // true
        System.out.println(twoAsOne(3, 2, 2)); // false
        split();
        System.out.println(lastDigit(23, 19, 13)); // true
        System.out.println(lastDigit(23, 19, 13)); // false
        System.out.println(lastDigit(23, 19, 3)); // true
        split();
        System.out.println(maxMod5(2, 3)); // 3
        System.out.println(maxMod5(6, 2)); // 6
        System.out.println(maxMod5(3, 2)); // 3
        split();
        System.out.println(blueTicket(9, 1, 0)); // 10
        System.out.println(blueTicket(9, 2, 0)); // 0
        System.out.println(blueTicket(6, 1, 4)); // 10
        System.out.println(blueTicket(20, 6, 4)); // 10
    }

    /*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of
    dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod*/
    public static boolean nearTen(int number) {
        return number % 10 <= 2 || number % 10 >= 8;
    }

    /*We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or
2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the
    amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always
    bad (0).*/
    private static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5)
            return 0;
        if (candy * 2 <= tea || tea * 2 <= candy)
            return 2;
        return 1;
    }

    /*Given three ints, a b c, return true if it is possible to add two of the ints to get the third.*/
    private static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || c + b == a || c + a == b;
    }

    /*Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note:
    the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.*/
    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }

    /*Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by
5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod"
    operator computes the remainder, e.g. 7 % 5 is 2.*/
    private static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 > b % 5) {
            if (a > b) {
                return b;
            } else {
                return a;
            }
        } else if (a > b) {
            return a;
        } else
            return b;
    }

    /*You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the
    sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more
    than either bc or ac sums, the result is 5. Otherwise the result is 0.*/
    private static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || c + a == 10) {
            return 10;
            //((a-c) == 10 || (b-a) == 10 || (a-b)==10
        } else if ((a + b) - (b - c) == 10 || (b + c) - (c + a) == 10 || (a + c) - (a + b) == 10) {
            return 5;
        }
        return 0;
    }


}
