package lesson43;

import java.util.Arrays;

public class CocktailSort {

    public static void main(String[] args) {

        int[] array = createArray(20);
        System.out.println("Оригинал массива " + Arrays.toString(array));
        int[] newArray = myNewCopyArray(array);
        int[] newArray1 = myNewCopyArray(array);
        System.out.println("Копия массива " + Arrays.toString(newArray));
        System.out.println("Это bubbleSort " + Arrays.toString(bubbleSort(newArray)));
        System.out.println("Коктейльная сортировка " + Arrays.toString(cocktailSort(newArray1)));
    }

    public static int[] cocktailSort(int[] array) {
        int count = 0;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int j = start; j < end; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int k = end; k > start; k--) {
                if (array[k] < array[k - 1]) {
                    int temp = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = temp;
                    swapped = true;
                }
            }
            start++;
            count++;
            if (!swapped) {
                break;
            }
            // System.out.println(count);
        }
        return array;
    }

    public static int[] myNewCopyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] bubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
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

    public static int[] createArray(int length) {
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        return myArray;
    }
}
