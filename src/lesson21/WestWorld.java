package lesson21;

import java.util.Scanner;

public class WestWorld {

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int k = tryAndCry();
        int number = magicNumber(100);
        guess(k, number);
    }

    private static void guess(int k, int computerNumber) {
        int userTryGuess = 0;
        int answer = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= k; i++) {
            System.out.println("А попробуйка угадать моё число!");
            userTryGuess = input.nextInt();
            if (userTryGuess == computerNumber) {
                System.out.println("Ура вы угадали");
                answer = 1;
                break;
            } else if (userTryGuess < computerNumber) {
                System.out.println("Загаданное число больше чем ваше");
            } else {
                System.out.println("Загаданное число меньше чем ваше");
            }
        }
        if (answer != 1) {
            System.out.println("Попытки закончились, может быть повезёт в другой раз!");
        }
    }

    private static int magicNumber(int range) {
        int number = (int) (Math.random() * ((range - 1) + 1)) + 1;
        //System.out.println(number);
        return number;
    }

    private static int tryAndCry() {
        int k = 0;
        System.out.println("Какой уровень сложности вы хотите? \n" +
                "Лёгкий(1)? Или для взрослых(2)? Введите 1 или 2");
        Scanner input = new Scanner(System.in);
        int userGameK = input.nextInt();
        if (userGameK == 1) {
            k = 10;
        } else k = 5;
        return k;
    }
}
