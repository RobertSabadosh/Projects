package lesson12;

public class ItsMyLife {

    public static void main(String[] args) {

        int weekDays = 5;
        myLife(weekDays);
        worker();
        System.out.println("-------------------------");
        myLittleFor();
    }

    public static void myLife(int amountWeekDays) {
        for (int i = 1; i <= amountWeekDays; i++) { // int i = 1 - начало(старт); i <= amountWeekDays - условие; i++ - шаг
            System.out.println("----------------------");
            System.out.println("Новый день " + i);
            System.out.println("Встаю в 6 утра");
            System.out.println("Иду на завод к 8");
            System.out.println("Возвращаюсь домой");
            System.out.println("Смотрю Netflix");
            System.out.println("Куение с соседом");
            System.out.println("Иду спать");
            System.out.println("Мой день закончился");
            System.out.println("------------------------");
        }
    }

    public static void worker() {
        String worker1 = "Даша";
        String worker2 = "Маша";
        String worker3 = "Саша";
        String worker4 = "Глаша";
        String worker5 = "Миша";
        String worker6 = "Паша";

        int worker1ID = 1;
        int worker2ID = 2;
        int worker3ID = 3;
        int worker4ID = 4;
        int worker5ID = 5;
        int worker6ID = 6;

        salary(worker6ID);
    }

    public static void salary(int countIDs) {
        for (int i = 0; i < countIDs; i++) {
            System.out.println("Работник с ИД номер = " + " должен получить " + 1000 + i * countIDs);
        }
    }

    public static void myLittleFor() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
        }
        System.out.println(a);
        for (int i = 0; i < 20; i++) {
            a++;
        }
        System.out.println(a);
    }
}
