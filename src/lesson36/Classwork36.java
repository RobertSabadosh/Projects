package lesson36;

import java.util.Arrays;

import static homeworks.UniversalMethod.split;

public class Classwork36 {

    public static void main(String[] args) {

        fizzBuzz(); // "Fizz"
//        System.out.println(fizzBuzz(5)); // "Buzz"
//        System.out.println(fizzBuzz(15)); // "FizzBuzz"
        System.out.println(Arrays.toString(fizzBuzz3(1, 6)));
        split();
        System.out.println(Arrays.toString(fizzBuzz3(15, 25)));
    }

    public static void fizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizzBuzz2(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static String[] fizzBuzz3(int min, int max) {
        int range = max - min;
        String[] output = new String[range];
        for (int i = 0; i < range; i++) {
            if ((i) % 3 == 0 && min % 5 == 0) {
                output[i] = "FizzBuzz";
            } else if (min % 3 == 0) {
                output[i] = "Fizz";
            } else if (min % 5 == 0) {
                output[i] = "Buzz";
            } else {
                output[i] = String.valueOf(min++);
            }
        }
        return output;
    }
}
