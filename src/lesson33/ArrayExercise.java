package lesson33;

import java.util.Arrays;

import static homeworks.UniversalMethod.printArray;
import static homeworks.UniversalMethod.split;

public class ArrayExercise {

    public static void main(String[] args) {

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{11, 5, 9};
        int[] a3 = new int[]{2, 11, 3};
        printArray(maxEnd3(a1)); // [3, 3, 3]
        printArray(maxEnd3(a2)); // [11, 11, 11]
        printArray(maxEnd3(a3)); // [3, 3, 3]

        split();

        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 2, 3, 4};
        int[] b3 = new int[]{7, 4, 6, 2};
        printArray(makeEnds(b1)); // [1, 3]
        printArray(makeEnds(b2)); // [1, 4]
        printArray(makeEnds(b3)); // [7, 2]
    }

    /*Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements
    to be that value. Return the changed array.*/
    public static int[] maxEnd3(int[] arr) {
        if (arr[0] > arr[arr.length - 1]) {
            arr[1] = arr[0];
            arr[2] = arr[0];
        } else if (arr[0] < arr[arr.length - 1]) {
            arr[0] = arr[arr.length - 1];
            arr[1] = arr[arr.length - 1];
        }
        return arr;
    }

    public static int[] fillArray(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            input[i] = value;
        }
        return input;
    }

    public static int[] maxEnd3Universal(int[] arr) {
        if (arr[0] > arr[arr.length - 1]) {
            fillArray(arr, arr[0]);
        } else if (arr[0] < arr[arr.length - 1]) {
            //fillArray(arr, arr[arr.length - 1]);
            Arrays.fill(arr, arr[arr.length - 1]);
        }
        return arr;
    }

    /*Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original
    array will be length 1 or more.*/
    public static int[] makeEnds(int[] arr) {
        int[] output = new int[2];
        output[0] = arr[0];
        output[output.length - 1] = arr[arr.length - 1];
        //output[1] = arr[arr.length - 1];
        return output;
    }
}
