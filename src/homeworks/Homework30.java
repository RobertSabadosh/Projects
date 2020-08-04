package homeworks;

import java.util.Random;

import static homeworks.UniversalMethod.split;

public class Homework30 {

    public static void main(String[] args) {

        char[] myCharArray = new char[]{'a', 'b', '.', '@', 'g', '7'};

        printMyCharArray(myCharArray);
        printMyCharArray(fillArrayRandomChar(myCharArray));

        //НОД
        /*System.out.println(greatestCommonDivisor(15, 60));
        System.out.println(greatestCommonDivisor(7, 3));
        System.out.println(greatestCommonDivisor(5, 15));
        System.out.println(greatestCommonDivisor(9, 12));
        split();
        //НОК
        System.out.println(leastCommonMultiple(60, 15));
        System.out.println(leastCommonMultiple(8, 9));
        System.out.println(leastCommonMultiple(7, 3));*/
    }

    public static void printMyCharArray(char[] ccc) {
        System.out.println("Символьный массив, длиной " + ccc.length);
        for (int i = 0; i < ccc.length; i++) {
            System.out.print(ccc[i] + " ");
        }
        System.out.println();
    }

    public static char[] fillArrayRandomChar(char[] ccc) {
        for (int i = 0; i < ccc.length; i++) {
            ccc[i] = (char) (Math.random() * 200);
        }
        return ccc;
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }

    public static int leastCommonMultiple(int a, int b) {
        int nod = a * b / greatestCommonDivisor(a, b);
        return nod;
    }
}
