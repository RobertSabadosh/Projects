package lesson42;

import java.util.Arrays;

public class MyDoubleArray {

    public static void main(String[] args) {

        double[] array = createDoubleArray(10);
        System.out.println(Arrays.toString(array));
        sortDoubleArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static double[] createDoubleArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = myRound(Math.random(), 4);
        }
        return array;
    }

    public static double myRound(double digit, int decimalPlaces) {
        double output = 0.0;
        int temp1 = (int) Math.pow(10, decimalPlaces);
        output = digit * temp1;
        int temp2 = (int) output;
        output = (double) temp2 / temp1;
        return output;
    }

    public static void sortDoubleArray(double[] array) {
        double count = 0.0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            sortDoubleArray(array);
        }
    }
}