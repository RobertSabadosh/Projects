package lesson45;

import java.util.Arrays;

import static lesson45.ArrayClasswork.united;

public class MagicArray {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] c = united(a1, a2);
        System.out.println(Arrays.toString(c));
    }
}
