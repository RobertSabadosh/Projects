package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
        //goodMorningInteger();
        findSquare();
    }

    public static void goodMorningInteger() {
        // мой код
        int a = 2;  // знак присваивания
        int b = 7;
        int c = a + b;

        System.out.println("Сумма а и б = " + c);

        int coat = 40;
        int pullover = 50;
        int baseCap = 15;
        int sum = coat + pullover + baseCap;
        System.out.println("С вас за все покупки, за свитер, за джинсы, и за кепку = " + (coat + pullover + baseCap) + " евро");
        System.out.println("Проверка значений покупки = " + sum);
    }

    public static void findSquare() {
        int myFirstVariable = 5;
        int square = myFirstVariable * myFirstVariable;
        int perimeter = 4 * myFirstVariable;
        System.out.println("Площадь квадрата = " + square);
        System.out.println("Периметр квадрата = " + perimeter);
    }
}
