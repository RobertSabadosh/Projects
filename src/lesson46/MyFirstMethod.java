package lesson46;

public class MyFirstMethod {

    public static void main(String[] args) {

        int a = 2_067_567_567;
        int b = 2_067_567_567;
        byte b1, b2;
        b1 = 120;
        b2 = 10;

/*        System.out.println("Пример с маленькими интами " + sum(5, 6));
        System.out.println("Пример с большими интами " + sum(a, b));
        System.out.println("Пример с байт" + myLittleSum(b1, b2));
        System.out.println("Максимально возможное число" + Integer.MAX_VALUE);*/

        System.out.println(adultSum(5, 6));
        System.out.println(adultSum(2_067_567_567, 2_067_567_567));
    }

    public static int adultSum(int a, int b) {
        assert (Integer.MAX_VALUE - a >= b) : "А и Б слишком велики для сложения";
        final int result = a + b;
        assert (result - a == b) : "Сумма неправильна";
        return result;
    }

    public static byte myLittleSum(byte b1, byte b2) {
        byte sum = (byte) (b1 + b2);
        if (sum - b1 == b2) {
            return sum;
        } else return -1;
    }

    public static int sum(int a, int b) {
        int d = a + b;
        if (Integer.MAX_VALUE - a >= b) {
            return a + b;
        } else return -1;
    }
}
