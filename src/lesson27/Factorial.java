package lesson27;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(findFactorial(5));
        System.out.println(findFactorial(7));
        System.out.println(findFactorial(10));
        System.out.println(findFactorial(20));

        System.out.println(findFactRecursion(5));
    }

    public static int findFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int findFactRecursion(int number) {
        if (number == 1) {
            return 1;
        } else if (number > 1) {
        }
        return 0;
    }
}
