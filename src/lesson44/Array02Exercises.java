package lesson44;

import static homeworks.UniversalMethod.split;

public class Array02Exercises {

    public static void main(String[] args) {

        int[] a1 = new int[]{10, 3, 5, 6}; // 7
        int[] a2 = new int[]{7, 2, 10, 9}; // 8
        int[] a3 = new int[]{2, 10, 7, 2}; // 8
        System.out.println(bigDiff(a1));
        System.out.println(bigDiff(a2));
        System.out.println(bigDiff(a3));

        split();

        int[] c1 = new int[]{1, 2, 2}; // 5
        int[] c2 = new int[]{1, 2, 2, 6, 99, 99, 7}; // 5
        int[] c3 = new int[]{1, 1, 6, 7, 2}; // 4
        System.out.println(sum67(c1));
        System.out.println(sum67(c2));
        System.out.println(sum67(c3));
    }

    public static int bigDiff(int[] input) {
        int min = findMin(input);
        int max = findMax(input);
        return max - min;
    }

    public static int findMax(int[] input) {
        int max = input[0];
        for (int i : input) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static int findMin(int[] input) {
        int min = input[0];
        for (int i : input) {
            min = Math.min(min, i);
        }
        return min;
    }

    private static int sum67(int[] arr) {
        int sum;
        int indexOfSix = findIndex(arr, 6);
        int indexOfSeven = findIndex(arr, 7);
        if (indexOfSeven == -1) {
            sum = findSum(arr, 0, arr.length);
        } else {
            sum = findSum(arr, 0, indexOfSix);
            sum += findSum(arr, indexOfSeven + 1, arr.length);
        }
        return sum;
    }

    public static int findSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int findIndex(int[] arr, int digit) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {
                index = i;
            }
        }
        return index;
    }

    private static int sum67Version1(int[] array) {
        int sum = 0;
        boolean sixMode = false;
        for (int i = 0; i < array.length; i++) {
            if (sixMode) {
                if (array[i] == 7) {
                    sixMode = false;
                }
            } else if (array[i] == 6) {
                sixMode = true;
            } else sum += array[i];
        }
        return sum;
    }
}
