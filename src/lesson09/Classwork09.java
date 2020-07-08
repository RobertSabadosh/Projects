package lesson09;

public class Classwork09 {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;
        //System.out.println(findNumber1(a, b));
        System.out.println(findNumber2(a, b));
        split();
        System.out.println(getStringMonth(a));
    }

    private static void split() {
        System.out.println("---------------------");
    }

    public static boolean findNumber2(int a, int b) {
        return a >= 10 && a < 20 || b >= 10 && b < 21;
    }

   /* public static boolean findNumber1(int a, int b) {
        if (a >= 10 && a < 20 || b >= 10 && b < 21){
            return true;
        }else
            return false;
    }*/

    public static int addition(int a, int b) {
        return a + b;
    }

    public static String getStringMonth(int month) {
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;
            default:
                monthString = "Invalid month - " + month;
                break;
        }
        return monthString;
    }
}
