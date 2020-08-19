package lesson38;

public class ImperativeMethod {

    public static void main(String[] args) {

        application();
    }

    public static void application() {
        int[] arr = {2, 5, 6, 4, 9, 1, 150, 89};
        int min = findMin(arr);
        int max = findMax(arr);
        int sum = findSum(arr);
        String output = "Система отработала со статусом ОК";
        System.out.println(output + "\n" + "найдена сумма всех чисел " + sum + min + max);
        System.out.println(findSum(arr));
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr) {
        int result = arr[0];
        for (int value : arr) {
            result = Math.max(result, value);
        }
        return result;
    }

    public static int findMin(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
