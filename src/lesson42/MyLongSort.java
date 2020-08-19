package lesson42;

import java.util.Arrays;

public class MyLongSort {

    public static void main(String[] args) {

        long[] array = createLongArray(10);
        System.out.println(Arrays.toString(array));

    }

    public static long[] createLongArray(int length) {
        long[] output = new long[length];
        return output;
    }
}
