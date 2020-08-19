package lesson42;

import java.util.Arrays;

public class MyFloatArray {

    static int COUNT = 0;

    public static void main(String[] args) {

        float[] myFloatArray = createFloatArray(10);
        System.out.println(Arrays.toString(myFloatArray));
        bubbleSort(myFloatArray);
        System.out.println("Количество обменов " + COUNT);
        System.out.println(Arrays.toString(myFloatArray));
    }

    public static float[] createFloatArray(int length) {
        float[] output = new float[length];
        for (int i = 0; i < length; i++) {
            output[i] = (float) Math.random() * 100;
        }
        return output;
    }

    public static void bubbleSort(float[] array) {
        boolean swap = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                float temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                swap = true;
                COUNT++;
            }
        }
        if (swap) {
            bubbleSort(array);
        }
    }
}
