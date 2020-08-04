package lesson31;

public class MyBooleanArrayInit {

    public static void main(String[] args) {

        boolean[] b = new boolean[10];
        printMyBooleanArray(b);
        fillBooleanArray(b);
    }

    public static void printMyBooleanArray(boolean[] b) {
        System.out.println("Массив с логическими данными, булевыми данными, длиной - " + b.length);
        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.println(b[b.length - 1] + ".");
    }

    public static boolean[] fillBooleanArray(boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = (Math.random() >= 0.5);
        }
        return b;
    }
}