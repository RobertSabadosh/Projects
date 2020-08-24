package lesson46;

import java.util.Scanner;

public class HW39GoldenHands {

    public static void main(String[] args) {

        System.out.println("Калькулятор расчёта стоимости работ по укладке плитки");
        calculator();
    }

    public static void calculator() {
        System.out.println("------------------------------------");
        System.out.println("Введите данные для расчёта");
        System.out.println("------------------------------------ \n");
        String[] dimensionsInput = new String[]{"Длина помещения: ", "Ширина помещения: ", "Длина плитки: ", "Ширина плитки: "};
        double[] sizes = dimensions(dimensionsInput);
        System.out.print("Количество плитки в упаковке: ");
        int packQty = new Scanner(System.in).nextInt();
        System.out.print("Стоимость упаковки плитки: ");
        double materialPrice = new Scanner(System.in).nextDouble();
        tileQuantity(sizes, packQty, materialPrice);
        System.out.println("\n1 - выбрать другой метод");
        System.out.println("2 - сделать новый расчёт\n");
        System.out.print("Ваш выбор: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case (1):
                tileQuantity(sizes, packQty, materialPrice);
            case (2):
                calculator();
            default:
                break;
        }
    }

    //Приём размеров помещения и размеров плитки в массив
    public static double[] dimensions(String[] s) {
        double[] a = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            a[i] = new Scanner(System.in).nextDouble();
        }
        return a;
    }

    public static void tileQuantity(double[] d, int packQty, double materialPrice) {
        System.out.println("Методы укладки плитки: \n 1 - вертикальный, \n 2 - горизонтальный, \n 3 - диагональный \n");
        System.out.print("Выберите метод укладки: ");
        int method = new Scanner(System.in).nextInt();
        System.out.println();
        double length = d[0];
        double width = d[1];
        double tLength = d[2];
        double tWidth = d[3];
        double coefficient = 1.1;
        double temp;
        if (method == 2) {
            temp = length;
            length = width;
            width = temp;
        } else {
            if (method == 3) {
                coefficient = 1.15;
            }
        }
        double floorSquare = length * width; //площадь покрытия
        int rowsQty = lineQty(length, tLength); //количество рядов плитки
        int columnsQty = lineQty(width, tWidth); //количество столбцов плитки
        int tilesQty = rowsQty * columnsQty; //количество плитки без запаса
        double packsQty = Math.ceil((double) (tilesQty) / packQty); //количество упаковок плитки без запаса
        int finalPacksQty = (int) Math.round(packsQty * coefficient);

        System.out.println("Площадь покрытия (м.кв.): " + floorSquare);
        System.out.println("Количество плиток без запаса: " + rowsQty + " * " + columnsQty + " = " + tilesQty);
        System.out.println("Количество коробок без запаса: " + (int) (packsQty));
        System.out.println("Количество коробок с запасом: " + finalPacksQty);
        System.out.println();

        proformaInvoice(floorSquare, finalPacksQty, 27.0, materialPrice);
    }

    public static void proformaInvoice(double square, int packs, double workPrice, double materialPrice) {
        //final int vat = 16;
        double materialTotalCost = packs * materialPrice;
        double workTotalCost = (int) (Math.round(square)) * workPrice;
        double totalCost = materialTotalCost + workTotalCost * 1.16;
        double vat = totalCost / 116 * 16;
        System.out.println("Расчёт стоимости укладки плитки для заданного помещения");
        System.out.println("-------------------------------------------------------");
        outPrint("Общая стоимость плитки: ", materialTotalCost);
        outPrint("Стоимость работ:        ", workTotalCost * 1.16);
        outPrint("ИТОГО:                  ", totalCost);
        outPrint("в т.ч. НДС 16%:         ", vat);
    }

    //Вывод в печать строки инвойса
    public static void outPrint(String s, double d) {
        System.out.print(s);
        System.out.printf("%.2f", d);
        System.out.println(" Евро");
    }

    //Вычисляем количество рядов плитки
    public static int lineQty(double side1, double side2) {
        int quantity;
        if ((int) (side1 % side2) == 0) {
            quantity = (int) (side1 / side2);
        } else {
            quantity = (int) (side1 / side2) + 1;
        }
        return quantity;
    }
}
