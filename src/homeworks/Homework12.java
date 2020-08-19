package homeworks;

import static homeworks.UniversalMethod.split;

public class Homework12 {

    public static void main(String[] args) {

        int n = 10;
        mirroredTriangle(n);
        split();
        triangle(n);
    }

    public static void mirroredTriangle(int countLine) {
        for (int i = 0; i <= countLine; i++) {
            for (int j = 0; j < countLine - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle(int countLine) {
        for (int i = 1; i <= countLine; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
