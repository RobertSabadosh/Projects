package homeworks;

import static homeworks.UniversalMethod.printArray;
import static homeworks.UniversalMethod.split;

public class Homework32 {

    public static void main(String[] args) {

        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};
        printArray(midThree(a1)); // [2, 3, 4]
        printArray(midThree(a2)); // [7, 5, 3]
        printArray(midThree(a3)); // [1, 2, 3]

        split();

        int[] b1 = new int[]{1, 3, 4, 5};
        int[] b2 = new int[]{2, 1, 3, 4, 5};
        int[] b3 = new int[]{1, 1, 1};
        System.out.println((unlucky1(b1))); // true
        System.out.println((unlucky1(b2))); // true
        System.out.println((unlucky1(b3))); // false

        split();

        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{1, 2, 3, 1};
        int[] c3 = new int[]{1, 2, 1};
        System.out.println((sameFirstLast(c1))); // false
        System.out.println((sameFirstLast(c2))); // true
        System.out.println((sameFirstLast(c3))); // true

        split();

        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = new int[]{5, 11, 2};
        int[] d3 = new int[]{7, 0, 0};
        System.out.println((sum3(d1))); // 6
        System.out.println((sum3(d2))); // 18
        System.out.println((sum3(d3))); // 7
    }

    /*Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The
    array length will be at least 3.*/
    public static int[] midThree(int[] arr) {
        int[] output = new int[3];
        for (int i = 0; i < output.length; i++) {
            output[i] = arr[arr.length / 2 - 1 + i];
        }
        return output;
    }

    /*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky
       1 in the first 2 or last 2 positions in the array.*/
    public static boolean unlucky1(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return false;
        } else
            return (arr[0] == 1 && arr[1] == 3) || (arr[1] == 1 && arr[2] == 3) || (arr[arr.length - 1] == 3 && arr[arr.length - 2] == 1);
    }

    /*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.*/
    public static boolean sameFirstLast(int[] arr) {
        return arr.length > 0 && arr[0] == arr[arr.length - 1];
    }

    /*Given an array of ints length 3, return the sum of all the elements.*/
    public static int sum3(int[] arr) {
        return arr[0] + arr[1] + arr[2];
    }
}