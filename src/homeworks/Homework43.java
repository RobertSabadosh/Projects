package homeworks;

import java.util.Arrays;

public class Homework43 {

    public static void main(String[] args) {

        byte arr[] = createMyByteArray(10);
        System.out.println("Original array " + Arrays.toString(arr));
        split();
        bubbleSort(arr);
        System.out.println("Sorted array with bubble sort " + Arrays.toString(arr));
        split();
        System.out.println("Copied array using array shadow cloning technique " + Arrays.toString(arrayShadowCloningTechnique(arr)));
        split();
        System.out.println("Sorted array with cocktail sort " + Arrays.toString(cocktailSort(arr)));

    }

    public static byte[] createMyByteArray(int length) {
        byte[] arr = new byte[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (byte) (Math.random() * 100);
        }
        return arr;
    }

    public static byte[] bubbleSort(byte[] array) {
        int count = 0;
        for (byte i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                byte temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSort(array);
        }
        return array;
    }

    public static byte[] arrayShadowCloningTechnique(byte[] array) {
        byte[] copy = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static byte[] cocktailSort(byte[] array) {
        byte count = 0;
        byte start = 0;
        byte end = (byte) (array.length - 1);
        while (start <= end) {
            boolean swapped = false;
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    byte temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int j = end; j > start; j--) {
                if (array[j] < array[j - 1]) {
                    byte temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            start++;
            count++;
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static void split(){
        System.out.println("------------------------------------------------------------------------------");
    }
}