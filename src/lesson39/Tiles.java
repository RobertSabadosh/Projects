package lesson39;

public class Tiles {

    public static void main(String[] args) {
        // 1 working hour = 27€
        // 1 tile = 30*20 cm;
        // 1 hour = 1 m²;
        // размеры стены/пола, стоимость плитки
        double tileLength = 30.0;
        double tileWidth = 20.0;
        double workingHour = 27.0;
        double tilePrice = 1.0;
        customerQuestion();
        //System.out.println(tileQuantity(30, 20, 3, 6));
    }

    public static void customerQuestion() {
        double tileLength = 30.0;
        double tileWidth = 20.0;
        //tileQuantity();
        double quantity = tileQuantity(30.0, 20.0, 3.0, 6.0);
        priceMaterial(1.0);
        priceWork(27.0, 3.0, 6.0);
        totalPrice(486.0, 300.0);
    }

    public static double totalPrice(double priceWork, double priceMaterial) {
        priceWork = priceWork(27.0, 3.0, 6.0);
        priceMaterial = priceMaterial(1.0);
        return priceWork + priceMaterial;
    }

    public static double priceWork(double workingHour, double floorLength, double floorWidth) {
        double hour = 1.0;
        return hour * workingHour * floorLength * floorWidth;
    }

    public static double priceMaterial(double tilePrice) {
        double quantity = tileQuantity(30.0, 20.0, 3.0, 6.0);
        return quantity * tilePrice;
    }

    public static double tileQuantity(double tileLength, double tileWidth, double floorLength, double floorWidth) {
        double quantity;
        floorLength = floorLength * 100;
        floorWidth = floorWidth * 100;
        quantity = (floorLength * floorWidth) / (tileLength * tileWidth);
        return quantity;
    }
}