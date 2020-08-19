package lesson12;

public class Homework1101 {

    public static void main(String[] args) {

        //homework11_1();
        //homework11_2(10, 5);
        //homework11_3(5, 17);
        //homework11_4();
        homework11_5(10);
    }

    public static void homework11_1() {
        for (int i = 0; i < 20; i *= 2) {
            System.out.println(i);
        }
    }

    public static void homework11_2(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void homework11_3(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void homework11_4() {
        for (int i = 3; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void homework11_5(int line) {
        String star = "*";
        String output = "";
        for (int i = 0; i < line; i++) {
            //output += star;
            output = output + star;
            System.out.println(output);
            //System.out.println(output += star);
        }
    }
}
