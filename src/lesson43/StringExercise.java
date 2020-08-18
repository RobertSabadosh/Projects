package lesson43;

public class StringExercise {

    public static void main(String[] args) {

        System.out.println(xyzMiddle("AAxyzBB")); // true
        System.out.println(xyzMiddle("AxyzBB")); // true
        System.out.println(xyzMiddle("AAxyBBB")); // false

        int[] a1 = new int[]{1, 2, 1, 1, 3};
        int[] a2 = new int[]{1, 4, 2, 1, 4, 1, 4};
        int[] a3 = new int[]{1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(a1)); // 4
        System.out.println(maxSpan(a2)); // 6
        System.out.println(maxSpan(a3)); // 6

        System.out.println(compareArraysElements(a1));

    }

    public static boolean xyzMiddle(String input) {
        int startRange = input.indexOf('x');
        int endRange = input.length() - input.indexOf('z') - 1;
        return Math.abs(endRange - startRange) <= 1;
    }

    public static int myIndexOf(char inputChar, String input) {
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == inputChar) {
                index = i;
            }
        }
        return index;
    }

    private static int compareArraysElements(int[] array) {
        int span = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (span < j - i) {
                        span = j - i + 1;
                    }
                }
            }
        }
        return span;
    }

    public static int maxSpan(int[] input) {
        int value = 0;
        int span = 0;
        for (int i = 0; i < input.length; i++) {

        }
        return 0;
    }
}