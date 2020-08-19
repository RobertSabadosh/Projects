package lesson43;

import java.util.Arrays;

public class StringExercise {

    public static void main(String[] args) {
        byte[] array = createByteArray(20);
        System.out.println("Оригинал       " + Arrays.toString(array));
        byte[] newArray = myNewCopyArray(array);
        byte[] cocktailArray = myNewCopyArray(array);
        System.out.println("Copy Array     " + Arrays.toString(newArray));
        System.out.println("bubbleSort     " + Arrays.toString(bubbleSort(newArray)));
        System.out.println("Cocktail Array " + Arrays.toString(cocktailSort(cocktailArray)));
    }

    private static byte[] cocktailSort(byte[] array) {
        byte count = 0;
        byte start = 0;
        byte end = (byte) (array.length - 1);
        while (start <= end) {
            boolean swapped = false;
            for (int i = start; i < end; i++) {
                if (array[i] < array[i + 1]) {
                    byte temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int j = end; j > start; j--) {
                if (array[j] > array[j - 1]) {
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

    private static byte[] myNewCopyArray(byte[] array) {
        byte[] copy = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
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

    private static byte[] createByteArray(int length) {
        byte[] array = new byte[length];
        for (int i = 0; i < length; i++) {
            array[i] = (byte) (Math.random() * 100);
        }

        return array;
    }


}