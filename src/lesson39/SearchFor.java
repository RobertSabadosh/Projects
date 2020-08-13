package lesson39;

public class SearchFor {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            //while (i == 4) {
            if (i == 4) {
                System.out.println("Распечатай 4 здесь");
                break; // выходим
            }
            System.out.println("i = " + i);
        }
        System.out.println("Цикл завершён");
    }
}
