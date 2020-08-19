package homeworks;

public class Homework03 {

    private static final double PI = 3.14;

    public static void main(String[] args) {

        circleArea();
        skip();
        circumferenceOfCircle();
        skip();
        ratioOfTheAreaOf​BelarusAndUkraine();
        skip();
        MoscowVSBerlin();
        skip();
        deposit();
    }

    public static void skip() {
        System.out.println("------------------------------------");
    }

    public static void circleArea() {
        //final double PI = 3.14;
        double radius = 5;
        double area = PI * radius * radius;
        System.out.println("Area of circle = " + area);
    }

    public static void circumferenceOfCircle() {
        //final double PI = 3.14;
        double radius = 7;
        double circumference = PI * 2 * radius;
        System.out.println("Circumference of the circle = " + circumference);
    }

    public static void ratioOfTheAreaOf​BelarusAndUkraine() {
        double belarusArea = 207595;
        double ukraineArea = 603628;
        double ratio = (belarusArea / ukraineArea) * 100;
        System.out.println("The ratio of the area of Belarus to the area of Ukraine is: " + ratio + "%");
    }

    public static void MoscowVSBerlin() {
        double moscowArea = 2511;
        double berlinArea = 891.8;
        double res = moscowArea / berlinArea;
        System.out.println("Moscow bigger than Berlin in = " + res + " times");
    }

    public static void deposit() {
        double cash = 1000;
        double interestRate = 0.035;
        double years = 7;
        double res = cash + (cash * interestRate * years);
        System.out.println(res);
    }
}
