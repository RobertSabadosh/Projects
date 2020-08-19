package lesson34;

import java.util.Arrays;

import static homeworks.UniversalMethod.split;

public class HW33 {

    public static void main(String[] args) {

        int[] a1 = new int[]{4, 5, 6};
        int[] a2 = new int[]{1, 2};
        int[] a3 = new int[]{3};
        System.out.println(Arrays.toString(makeLast(a1))); // [0, 0, 0, 0, 0, 6]
        System.out.println(Arrays.toString(makeLast(a2))); // [0, 0, 0, 2]
        System.out.println(Arrays.toString(makeLast(a3))); // [0, 3]

        split();

        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 3};
        int[] b3 = new int[]{7, 2, 3};
        int[] b4 = new int[]{1};
        int[] b5 = new int[]{1, 2};
        int[] b6 = new int[]{};
        System.out.println(start1(b1, b2)); // 2
        System.out.println(start1(b3, b4)); // 1
        System.out.println(start1(b5, b6)); // 1

        split();

        int[] d1 = new int[]{1, 2};
        int[] d2 = new int[]{3, 4};
        int[] d3 = new int[]{4, 4};
        int[] d4 = new int[]{2, 2};
        int[] d5 = new int[]{9, 2};
        int[] d6 = new int[]{3, 4};
        System.out.println(Arrays.toString(plusTwoSimple(d1, d2))); // [1, 2, 3, 4]
        System.out.println(Arrays.toString(plusTwoSimple(d3, d4))); // [4, 4, 2, 2]
        System.out.println(Arrays.toString(plusTwoSimple(d5, d6))); // [9, 2, 3, 4]

        split();

        int[] c1 = new int[]{1, 2};
        int[] c2 = new int[]{3, 4};
        int[] c3 = new int[]{4, 4};
        int[] c4 = new int[]{2, 2};
        int[] c5 = new int[]{9, 2};
        int[] c6 = new int[]{3, 4};
        System.out.println(Arrays.toString(plusTwo(c1, c2))); // [1, 2, 3, 4]
        System.out.println(Arrays.toString(plusTwo(c3, c4))); // [4, 4, 2, 2]
        System.out.println(Arrays.toString(plusTwo(c5, c6))); // [9, 2, 3, 4]
    }

    /*Given an int array, return a new array with double the length where its last element is the same as the original array, and all
    the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's*/
    public static int[] makeLast(int[] arr) {
        int[] output = new int[arr.length * 2];
        output[output.length - 1] = arr[arr.length - 1];
        return output;
    }

    /*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.*/
    public static int start1(int[] arr1, int[] arr2) {
        int count = 0;
        if (arr1.length > 0 && arr1[0] == 1) {
            count += 1;
        }
        if (arr2.length > 0 && arr2[0] == 1) {
            count++;
        }
        return count;
    }

    /* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.*/
    public static int[] plusTwoSimple(int[] arr1, int[] arr2) {
        int[] output = new int[4];// [arr1.length + arr2.length]
        output[0] = arr1[0];
        output[1] = arr1[1];
        output[2] = arr2[0];
        output[3] = arr2[1];
        return output;
    }

    public static int[] plusTwo(int[] arr1, int[] arr2) {
        int[] output = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            output[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            output[i + arr2.length] = arr2[i];
        }
        return output;
    }
}
