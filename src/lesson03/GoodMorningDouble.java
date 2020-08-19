package lesson03;

public class GoodMorningDouble {

    public static void main(String[] args) {

        // 3,5 => 3.5  100_34534_34534
        // helloDouble();
        // findSquareCircle();
        helloDoubleTwo();
    }

    public static void helloFloat() {
        float a, b, c, d, f, e, g;
        a = (float) 3.5;
        b = 5.4F;
        c = 10.11f;
        d = a + b + c;
        f = 10.0f;
    }

    public static void helloDouble() {
        double a, b, c;
        int d, f, e;

        d = 10; // у меня есть 10евро
        f = 1000; // айфон стоит тысячу евро

        // сколько айфонов я могу купить за 10 евро;
        e = d / f;
        System.out.println("количество купленных айфонов  = " + e);

        a = 10.0; // 10 евро и ноль центов
        b = 20.0; // 20 евро килограмм черешни
        c = a / b;  // количество черешни, которое я могу себе позволить

        System.out.println("Количество черешни, которое я куплю " + c);
    }

    public static void findSquareCircle() {
        final double PI = 3.14;
        final double minTemp = 18;
        final double maxTemp = 26;
        // final - используется для "финализации" переменной,
        // теперь переменной PI нельзя присвоить другое значение.
        double r = 10;
        double square = PI * r * r;
        double anotherSquare = Math.PI * Math.pow(r, 2);
        double anotherPI = Math.PI;
        System.out.println("Площадь найденная ручками = " + square);
        System.out.println("Площадь найденная Java = " + anotherSquare);

          /*Тип Максимальное позитивное значение	Минимальное позитивное значение	Размер (бит)
          float	3.4028234663852886E+038	1.4012984643248171E-045	32
          double	1.7976931348623157E+308	4.9406564584124654E-324	64*/
    }

    public static void helloDoubleTwo() {
        double a = 10;
        double b = 5;
        double c = Math.pow(b, a);
        System.out.println("Вроде как пять в степени 10 = " + c);
    }
}
