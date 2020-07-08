package lesson08;

public class Classwork0902 {
    public static void main(String[] args) {
        System.out.println(nearHundred1(93)); // ожидаем true
        System.out.println(nearHundred1(90)); // ожидаем true
        System.out.println(nearHundred1(89)); // ожидаем false
        split();
        System.out.println(getPercent(1000.0, 7.0));
        split();
        System.out.println(findElectricityPrice(50));
    }

    public static void split() {
        System.out.println("-------------------");
    }

    public static boolean nearHundred1(int digit) {
        int range = 10;
        //если разница 100 и digit < range
        if (Math.abs(digit - 100) <= range || Math.abs(digit - 200) <= range) {
            return true;
        } else
            return false;
    }

    public static boolean nearHundred2(int digit) {
        int range = 10;
        //если разница 100 и digit < range
        return Math.abs(digit - 100) <= range || Math.abs(digit - 200) <= range;
    }

    public static double getPercent(double amount, double interest) {
        return amount / 100 * interest;
    }

    public static double findElectricityPrice(double kwh) {
        double basicKwhPrice = 0.2;
        double basicPrice = 30.0;
        double basicKwh = 100;
        double resultPrice;
        if (kwh > 100) {
            //kwh=kwh-basicKwh;
            kwh -= basicKwh;
            resultPrice = kwh * basicKwhPrice + basicPrice;
        } else {
            resultPrice = basicPrice;
        }
        return resultPrice;
    }
}