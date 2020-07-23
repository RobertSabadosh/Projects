package lesson20;

public class Proof {

    public static void main(String[] args) {
        printMyStrDigitTimes("test", 19);

        int myPermis = 56;
    }

    private static void printMyStrDigitTimes(String str, int digit) {
        // эта программа сделана для того, что бы вывести на экран дигит раз слово из аргументов
        if (digit <= 0) {
            for (int i = 0; i < digit; i++) {
                System.out.println(str);
            }
        }
        System.out.println("Наше число меньше нуля, задайте другое");

    }
}
