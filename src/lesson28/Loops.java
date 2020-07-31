package lesson28;

public class Loops {

    public static void main(String[] args) {

        nestedLoops();
        multiplicationTable(10);

    }

    public static void nestedLoops() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Внешний круг");
            for (int j = 0; j < 6; j++) {
                System.out.println("Пирожки " + j);

            }
        }
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(formatForMPTable(i, j));
            }
            System.out.println();
        }
    }

    public static String formatForMPTable(int i, int j) {
        String result = String.valueOf(i * j);
        if (i * j < 10) {
            result = "   " + i * j;
        }
        if (i * j < 100) {
            result = "  " + i * j;
        } else if (i * j < 1000) {
            result = " " + i * j;
            return result;
        }
        return result;
    }
}