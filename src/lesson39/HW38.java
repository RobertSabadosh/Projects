package lesson39;

import static homeworks.UniversalMethod.split;

public class HW38 {

    public static void main(String[] args) {

        int[] a1 = new int[]{2, 1, 2, 3, 4};
        int[] a2 = new int[]{2, 2, 0};
        int[] a3 = new int[]{1, 3, 5};
        System.out.println(countEvens(a1)); // → 3
        System.out.println(countEvens(a2)); // → 3
        System.out.println(countEvens(a3)); // → 0

        split();

        int[] b1 = new int[]{1, 2, 1, 1, 3}; // → 4
        int[] b2 = new int[]{1, 4, 2, 1, 4, 1, 4}; // → 6
        int[] b3 = new int[]{1, 4, 2, 1, 4, 4, 4}; // → 6
        System.out.println(maxSpan(b1)); // → 4
        System.out.println(maxSpan(b2)); // → 6
        System.out.println(maxSpan(b3)); // → 6
    }

    /*Consider the leftmost and righmost appearances of some value in an array.
    We'll say that the "span" is the number of elements between the two inclusive.
    A single value has a span of 1.
    Returns the largest span found in the given array. (Efficiency is not a priority.) */
    public static int maxSpan(int[] b) {
        int spanLast = 0;
        int spanFirst = 0;
        int find = 0;
        int find2 = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == b[b.length - 1]) {
                find++;
                if (find == 1) {
                    spanLast = b.length - i;
                }
            }
        }
        for (int i = b.length - 1; i >= 0; i--) {
            if (b[i] == b[0]) {
                find2++;
                if (find2 == 1) {
                    spanFirst = i + 1;
                }
            }
        }
        if (spanFirst > spanLast) {
            return spanFirst;
        }
        return spanLast;
    }

    /*Return the number of even ints in the given array.
    Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    Возвращает количество четных чисел в данном массиве. Примечание: оператор % "mod" вычисляет остаток,
    например, 5 % 2 равно 1 */
    public static int countEvens(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                ++count;
            }
        }
        return count;
    }
}
