package lesson36;

public class ArrayExerciseMaxTriple {

    public static void main(String[] args) {

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 5, 3,};
        int[] a3 = new int[]{5, 7, 2, 8, 3};
        System.out.println(maxTriple(a1)); // 3
        System.out.println(maxTriple(a2)); // 5
        System.out.println(maxTriple(a3)); // 5
    }

    /*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array
    length will be a least 1.*/
    public static int maxTriple(int[] arr) {
        int result = arr[0];
        int middle = arr[arr.length / 2];
        int end = arr[arr.length - 1];
        /*if (middle > result) {
            result = middle;
        } if (end> result) {
            result = end;
        }*/
        result = Math.max(result, middle);
        result = Math.max(result, end);
        return result;
    }
}
