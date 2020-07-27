package lesson24;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        int range = getMeRange();
        int tryAndCry = getMeTries();
        int computerDigit = createDigit(range);
        myGame(tryAndCry, computerDigit);
    }

    private static void myGame(int tryAndCry, int computerDigit) {
        int userTries;
        boolean checkWin = false;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < tryAndCry; i++) {
            System.out.println("Твоё число, кожаный мешок!");
            userTries = input.nextInt();
            if (userTries == computerDigit) {
                System.out.println("Ты выиграл великий маг и волшебник!");
                checkWin = true;
                break;
            } else if (userTries > computerDigit) {
                System.out.println("загаданное число меньше твоего!");
            } else {
                System.out.println("загаданное число больше твоего твоего!");
            }
        }
        if (!checkWin) {
            System.out.println("Попытки закончились, может быть повезёт в другой раз!");
        }else{
            System.out.println("Ещё раз поздравляю");
        }
    }

    private static int getMeTries() {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста введите число попыток для отгадывания, например 5");
        int userSecondNumber = input.nextInt();
        return userSecondNumber;
    }

    private static int getMeRange() {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста введите диапазон чисел для игры, например 100");
        int userFirstNumber = input.nextInt();
        return userFirstNumber;
    }

    private static int createDigit(int range) {
        return (int) (Math.random() * ((range - 1) + 1)) + 1;
    }
}

