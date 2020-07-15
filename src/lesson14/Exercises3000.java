package lesson14;

public class Exercises3000 {
    public static void main(String[] args) {

        findMagicNumber();
    }

    public static void findMagicNumber() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }
    }
}
