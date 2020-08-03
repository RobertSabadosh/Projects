package lesson30;

public class GoodMorningArraysDayTwo {

    public static void main(String[] args) {
        int myRandom = (int) (Math.random() * 100);
        int[] a1 = new int[myRandom];
        //System.out.println(a1.length);
        //fillMyLovelyArray(a1);
        myArrayPrint(arrayTryAndCry(10));
    }

    public static int[] arrayTryAndCry(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }

    public static void fillMyLovelyArray(int[] inputArray) {
        // System.out.println(inputArray[1]);
        // System.out.println("Массив длиной - " + inputArray.length);
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (int) (Math.random() * 100);
        }

        myArrayPrint(inputArray);
        int max = findMax(inputArray);
        int min = findMin(inputArray);
        int average = findAverage(inputArray);
/*        System.out.println("Среднее значение элементов массива " + average);
        System.out.println("Максимальное значение элементов массива " + max);
        System.out.println("Минимальное значение элементов массива " + min);*/
    }

    private static int findAverage(int[] inputArray) {
        int sum = 0;
        for (int elementik : inputArray) {
            sum = sum + elementik;
        }
        return sum / inputArray.length;
    }

    private static int findMin(int[] inputArray) {
        int min = inputArray[0];
        for (int j : inputArray) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    private static int findMax(int[] inputArray) {
        int max = inputArray[0];
        for (int j : inputArray) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
