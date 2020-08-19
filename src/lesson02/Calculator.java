package lesson02;

public class Calculator {

    public static void main(String[] args) {

        helloLong();
        helloByte();
    }

    public static void helloLong() {
        long a = 7456678897L;
        long b = 12345678910l;
        long c = 56_788_876_543_211_234L;
        long little = 100;
        long sum = a + b + c;
        System.out.println("Здесь должна быть сумма трёх очень при очень больших переменных " + sum);
    }

    public static void helloByte() {
        byte a = 111;
        short b = 1111;
        int c = 1_111_111_111;
        long d = 2_3_4_5_6______7_8_9L;
        // Постфикс l или L обозначает литералы типа long.
        // L нужна только за границами int.
        // В Java можно использовать подчёркивания для визуального разделения чисел.
        // 2_358_765_649 = 2358765649, для программы разницы нет.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
