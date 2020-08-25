package homeworks;

import java.util.Arrays;

public class Homework46 {

    public static void main(String[] args) {

        char[] myArray = createCharArray(33);
        System.out.println("Random char array " + Arrays.toString(myArray));
        char[] copy = copyArray(myArray);
        System.out.println("Bubble sort " + Arrays.toString(bubbleSortArray(copy)));
        System.out.println("Cocktail sort " + Arrays.toString(cocktailSort(copy)));
        System.out.println("Comb sort " + Arrays.toString(combSort(copy)));
    }

    public static char[] createCharArray(int length) {
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = getMeChar(1072, 1100);
        }
        return array;
    }

    public static char getMeChar(int min, int max) {
        return (char) (Math.random() * ((max - min) + 1) + min);
    }

    public static char[] copyArray(char[] arr) {
        char[] copy = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return arr;
    }

    public static char[] bubbleSortArray(char[] myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            char temp = ' ';
            if (myArray[i] > myArray[i + 1]) {
                temp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortArray(myArray);
        }
        return myArray;
    }

    public static char[] cocktailSort(char[] copy) {
        int start = 0;
        int end = copy.length - 1;
        while (start <= end) {
            boolean sorted = false;
            for (int i = start; i < end; i++) {
                if (copy[i] > copy[i + 1]) {
                    char temp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = temp;
                    sorted = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (copy[i] < copy[i - 1]) {
                    char temp = copy[i];
                    copy[i] = copy[i - 1];
                    copy[i - 1] = temp;
                    sorted = true;
                }
            }
            start++;
            if (!sorted) break;
        }
        return copy;
    }

    public static char[] combSort(char[] myArray) {
        double factor = 1.24733095;
        int step = myArray.length;
        while (step > 1) {
            step = (int) (step / factor);
            for (int i = 0; step + i < myArray.length; i++) {
                if (myArray[i] > myArray[i + step]) {
                    char temp = myArray[i];
                    myArray[i] = myArray[i + step];
                    myArray[i + step] = temp;
                }
            }
        }
        return myArray;
    }
}
