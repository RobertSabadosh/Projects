package lesson31;

import static homeworks.UniversalMethod.split;
import static lesson30.GoodMorningArraysDayTwo.myArrayPrint;


public class ArrayExercise {

    public static void main(String[] args) {

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] a3 = new int[]{7, 3, 2};
        int[] a4 = new int[]{1, 3};
        System.out.println(commonEnd(a1, a2)); // true
        System.out.println(commonEnd(a1, a3)); // false
        System.out.println(commonEnd(a1, a4)); // true

        split();

        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};
        myArrayPrint(reverse3(b1)); // [3, 2, 1]
        myArrayPrint(reverse3(b2)); // [9, 11, 5]
        myArrayPrint(reverse3(b3)); // [0, 0, 7]

        split();

        int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};
        myArrayPrint(middleWay(mc1, mc2)); // [2, 5]
        myArrayPrint(middleWay(kc1, kc2)); // [7, 8]
        myArrayPrint(middleWay(nc1, nc2)); // [2, 4]
    }

    /*Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both
    arrays will be length 1 or more.*/
    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
        // return a[0] == b[0] || a[a.length - 1] == b[b.length - 1]
    }

    /*Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}*/
    public static int[] reverse3(int[] input) {
        int[] output = new int[]{input.length};
        for (int i = 0; i < input.length; i++) {
            output[output.length - 1 - i] = input[i];
        }
        return output;
    }

    /*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.*/
    public static int[] middleWay(int[] a, int[] b) {
        int[] output = new int[2];
        output[0] = a[1];
        output[1] = b[1];
        return output;
    }
}
