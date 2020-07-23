package homeworks;

import static homeworks.UniversalMethod.split;

public class Homework18 {

    public static void main(String[] args) {

        numbers(5, 5);
        split();
        numbers2(10,10);
        split();
        betweenAandB(5, 17);
        split();
        betweenAandB2(5, 17);
        split();
        betweenAandB3(5,17);
        split();
        triangle(10);
        split();
        triangle2(10);
    }

    public static void numbers(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void numbers2(int a, int b){
        if (b>0){
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        }
    }

    public static void betweenAandB(int a, int b) {
        for (; a < b; a++) {
            System.out.println(a);
        }
    }

    public static void betweenAandB2(int a, int b) {
        while (a < b) {
            System.out.println(a);
            a++;
        }
    }

    public static void betweenAandB3(int a, int b) {
        do {
            System.out.println(a);
            a++;
        }
        while (a < b);
    }

    public static void triangle(int countLine) {
        String str = "*";
        for (int i = 0; i < countLine; i++) {
            System.out.println(str);
            str += "*";
        }
    }

    public static void triangle2(int countLine) {
        for (int i = 1; i <= countLine; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}