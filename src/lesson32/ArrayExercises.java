package lesson32;

import static homeworks.UniversalMethod.printArray;
import static homeworks.UniversalMethod.split;

public class ArrayExercises {

    public static void main(String[] args) {

        int[] a1 = new int[]{4, 5};
        int[] a2 = new int[]{4, 2};
        int[] a3 = new int[]{3, 5};
        System.out.println(no23(a1)); // true
        System.out.println(no23(a2)); // false
        System.out.println(no23(a3)); // false

        split();

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{2, 3, 5};
        int[] c = new int[]{1, 2, 1};
        printArray(fix23(a)); // [1, 2, 0]
        printArray(fix23(b)); // [2, 0, 5]
        printArray(fix23(c)); // [1, 2, 1]

        split();

        int[] b1 = new int[]{1, 2, 3, 4};
        int[] b2 = new int[]{7, 1, 2, 3, 4, 9};
        int[] b3 = new int[]{1, 2};
        printArray(makeMiddle(b1)); // [2, 3]
        printArray(makeMiddle(b2)); // [2, 3]
        printArray(makeMiddle(b3)); // [1, 2]


    }

    /*Given an int array length 2, return true if it does not contain a 2 or 3.*/
    public static boolean no23(int[] a) {
        return (a[0] != 2 && a[0] != 3 && a[1] != 2 && a[1] != 3);
    }

    /*Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the
    changed array.*/
    public static int[] fix23(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 && arr[i + 1] == 3) {
                arr[i + 1] = 0;
            }
        }
        return arr;
    }

    /*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original
    array. The original array will be length 2 or more.*/
    public static int[] makeMiddle(int[] arr) {
        int[] output = new int[2];
        output[1] = arr[arr.length / 2];
        output[0] = arr[arr.length / 2 - 1];
        return output;
    }

}