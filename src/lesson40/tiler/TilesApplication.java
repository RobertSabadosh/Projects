package lesson40.tiler;

public class TilesApplication {

    final static double MASTER_PRICE_PRO_METER = 27.0;

    public static void start(double rWidth, double rLength, double tilesPrice) {

        double tilesWidth = 20.0; // сантиметры
        double tilesLength = 30.0;  // сантиметры
        double square = rLength * rWidth;

        int tilesWholeQuantity = getMeWholeTilesQuantity(rLength, rWidth, tilesLength, tilesWidth);
        int tilesQuantity = getMeTilesQuantity(rLength, rWidth, tilesLength, tilesWidth);
        double sumMaterialCost = getMeMaterialCost(tilesPrice, tilesQuantity);
        double sumWorkHour = getMeSumWorkHour(square);
        double totalSumWithOutNds = sumMaterialCost + sumWorkHour;
        int tilesBroken = tilesQuantity - tilesWholeQuantity;
        double MwST = 16;
        double nds = totalSumWithOutNds * MwST / 100;
        double itogo = totalSumWithOutNds + nds;

        System.out.println("Программа расчёта стоимости плитки стройтреста №12");
        System.out.println("Для поверхности с " + square
                + " метров квадратных, и со стоимостью одной плитки в " + tilesPrice + '€');
        System.out.println("Стоимость работы - " + sumWorkHour + '€');
        System.out.println("Стоимость материала - " + sumMaterialCost + '€');
        System.out.println("Итоговая сумма - " + totalSumWithOutNds + '€');
        System.out.println("Всего потребуется плиток - " + tilesQuantity);
        System.out.println("Из них поломанных - " + tilesBroken);

        System.out.println("Ещё раз сумма без ндс " + totalSumWithOutNds);
        System.out.println("Ндс " + MwST + "  в еврах " + nds);
        System.out.println("Итого " + itogo);


        tilesWholeQuantity = getMeWholeTilesQuantity(rWidth, rLength, tilesLength, tilesWidth);
        tilesQuantity = getMeTilesQuantity(rWidth, rLength, tilesLength, tilesWidth);
        tilesBroken = tilesQuantity - tilesWholeQuantity;
        System.out.println("-------------------------");
        System.out.println("Но если плитку положить поперёк, то ТАХДА");
        System.out.println("Всего потребуется плиток - " + tilesQuantity);
        System.out.println("Из них поломанных - " + tilesBroken);
    }

    public static double getMeSumWorkHour(double square) {
        return square * MASTER_PRICE_PRO_METER;
    }

    public static double getMeMaterialCost(double priceTiles, int quantity) {
        return priceTiles * quantity;
    }

    public static int getMeWholeTilesQuantity(double roomLength, double roomWidth, double tilesLength, double tilesWidth) {
        tilesLength = tilesLength / 100;
        tilesWidth = tilesWidth / 100;
        int lineLength = (int) Math.floor(roomLength / tilesLength);
        int lineWidth = (int) Math.floor(roomWidth / tilesWidth);
        int result = lineLength * lineWidth;
        return result;
    }

    public static int getMeTilesQuantity(double roomLength, double roomWidth, double tilesLength, double tilesWidth) {
        tilesLength = tilesLength / 100;
        tilesWidth = tilesWidth / 100;
        int lineLength = (int) Math.ceil(roomLength / tilesLength);
        int lineWidth = (int) Math.ceil(roomWidth / tilesWidth);
        int result = lineLength * lineWidth;
        return result;
    }
}
