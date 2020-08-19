package lesson39;

public class MyContinue {

    public static void main(String[] args) {

        for (int i = 0; i <= 6; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(" Облом строки");
        }
    }
}
