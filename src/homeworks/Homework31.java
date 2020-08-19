package homeworks;

import static homeworks.UniversalMethod.printArray;
import static homeworks.UniversalMethod.split;

public class Homework31 {

    public static void main(String[] args) {

        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};
        printArray(reverse3One(b1)); // [3, 2, 1]
        printArray(reverse3One(b2)); // [9, 11, 5]
        printArray(reverse3One(b3)); // [0, 0, 7]
        split();
        printArray(reverse3Two(b1)); // [3, 2, 1]
        printArray(reverse3Two(b2)); // [9, 11, 5]
        printArray(reverse3Two(b3)); // [0, 0, 7]

        split();

        int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};
        printArray(middleWayOne(mc1, mc2)); // [2, 5]
        printArray(middleWayOne(kc1, kc2)); // [7, 8]
        printArray(middleWayOne(nc1, nc2)); // [2, 4]
        split();
        printArray(middleWayTwo(mc1, mc2)); // [2, 5]
        printArray(middleWayTwo(kc1, kc2)); // [7, 8]
        printArray(middleWayTwo(nc1, nc2)); // [2, 4]
    }

    public static int[] reverse3One(int[] b) {
        return new int[]{b[2], b[1], b[0]};
    }

    public static int[] reverse3Two(int[] b) {
        int[] arr = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            arr[i] = b[b.length - 1 - i];
        }
        return arr;
    }

    public static int[] middleWayOne(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static int[] middleWayTwo(int[] a, int[] b) {
        return new int[]{a[a.length / 2], b[b.length / 2]};
    }

    /*public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }*/
}
