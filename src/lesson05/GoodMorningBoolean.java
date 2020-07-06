package lesson05;

public class GoodMorningBoolean {
    public static void main(String[] args) {
        System.out.println("Разрешение на прогулку " + walking(26));
/*        int standart = 0;
        String sts = "";
        double ds = 0.0;*/
    }

    public static boolean walking(double temperature) {
        boolean result = false;
        if (temperature > 25) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
