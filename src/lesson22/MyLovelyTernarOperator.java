package lesson22;

public class MyLovelyTernarOperator {

    public static void main(String[] args) {

        test1();
    }

    public static void test1() {
        int a = 10;
        int b = 20;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println("c из if-else оператора" + c);
    }

    public static void test2() {
        int a = 10;
        int b = 20;
        int c;
        c = (a > b) ? a : b;
        System.out.println("c из тернарного оператора" + c);
    }
}
