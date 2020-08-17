package lesson42;

import java.util.Arrays;

public class MyCharSort {

    public static void main(String[] args) {

        char[] array = createCharArray(10);
        System.out.println(Arrays.toString(array));
        sortCharArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static char[] createCharArray(int length) {
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {  // for (int i = 0; i < array.length; i++) - значення те масе
            array[i] = getMeChar(70, 110);
        }
        return array;
    }

    public static char getMeChar(int min, int max) {
        char c = (char) (Math.random() * ((max - min) + 1) + min);
        return c;
    }

    public static void sortCharArray(char[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                char temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            sortCharArray(array);
        }
    }
}