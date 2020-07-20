package homeworks;

public class Homework06 {

    public static void main(String[] args) {
        int clientAge1 = 10;
        int clientAge2 = 17;
        int clientAge3 = 18;
        int clientAge4 = 20;
        int clientAge5 = 30;
        String rightAction = cashiersAction(clientAge1);
        System.out.println(rightAction);

        split();

        int month1 = 1;
        int month2 = 1;
        int month3 = 2;
        int month4 = 2;
        int month5 = 2;
        int month6 = 3;
        int month7 = 3;
        int month8 = 3;
        int month9 = 4;
        int month10 = 4;
        int month11 = 4;
        int month12 = 1;
        String whichSeason = seasons(month5);
        System.out.println(whichSeason);

    }

    private static void split() {
        System.out.println("------------------------");
    }

    public static String cashiersAction(int clientAge) {
        String result;

        switch (clientAge) {
            case 10:
                result = "Иди ка ты в школу парень";
                break;
            case 17:
                result = "В Вашем случае максимум пиво";
                break;
            case 18:
                result = "18 есть?";
                break;
            case 20:
                result = "Карточка есть?";
                break;
            case 30:
                result = "Пакет нужен";
                break;
            default:
                result = "Покажите паспорт";
                break;
        }
        return result;
    }

    public static String seasons(int month) {
        String result = "";

        switch (month) {
            case 1:
                result = "Зима";
                break;
            case 2:
                result = "Весна";
                break;
            case 3:
                result = "Лето";
                break;
            case 4:
                result = "Осень";
                break;
            default:
                result = "Нет такого сезона";

        }
        return result;
    }
}
