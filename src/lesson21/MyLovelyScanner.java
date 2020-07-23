package lesson21;

import java.util.Scanner;

public class MyLovelyScanner {

    public static void main(String[] args) {
/*        System.out.print("Hello World");
        System.out.println();*/

        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Сколько тебе лет");
        age = input.nextInt();
        if (age >= 18) {
            System.out.println("Можешь покупать любое спиртное");
        } else {
            System.out.println("Иди отсюда мальчик!");
        }

        System.out.println("А как тебя зовут?");
        String name = input.next();

        System.out.println("Привет" + name);
    }
}
