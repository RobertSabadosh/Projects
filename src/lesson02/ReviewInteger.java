package lesson02;

public class ReviewInteger {
    public static void main(String[] args) {
        // System.out.println("Периметр квадрата = " + (4 * 10));
        // helloInteger();
        // helloByte();
        // helloShort();
        findCubeSquare();
    }

    public static void helloInteger() {
        int sideRectangle = 10; // метров
        int square = sideRectangle * sideRectangle; // sideRectangle
        int perimeter = 4 * sideRectangle;
        System.out.println("Периметр квадрата = " + perimeter);
        System.out.println("Площадь квадрата = " + square);
    }

    public static void helloByte() {
        byte myLittleFirstByteToday = 2;
        byte b = 3;
        byte sum = (byte) (myLittleFirstByteToday + b);
        System.out.println("результат сложения из метода helloByte = " + sum);
    }

    public static void helloShort() {
        short a = 3;
        short b = 4;
        short z = (short) (a + b);
        System.out.println("результат сложения из метода helloShort = " + z);
    }

    public static void helloLong() {
        long a, b, c, d, e;
        a = 123456789876L;
        b = 9876543312345l;
        c = 1001;
        d = 123_456_789_876L;
        int myFirstInt, mySecondInt;
    }

    public static void helloBinary() {
        int hexValue1 = 0x100; // Шестнадцатеричная система счисления
        int binary = 0B1001____1___001; // Двоичная система счисления
        int octal = 0757;  // восьмеричная система счисления

    }

    //Определение, объявление, инициализация переменных
    //
    //Definition, declaration, initialization

    public static void helloDeclaration() {
        short b;
        b = 10;
    }

    public static void findCubeSquare() {
        int a = 5;
        int square = 6 * a * a;
        System.out.println("Площадь куба = " + square);
    }

    // Найти количество зёрен на шахматной доске,
// если на первую клетку положить одно зёрнышко,
// на вторую клетку два зёрнышка,
// на третью в два раза больше,
// чем на предыдущей, то есть четыре и так далее.
    public static void chess() {
        int squareCount = 64;
        int powerTwo = 2;

        // искомое число = 2*(64-1) +1;
    }
}
