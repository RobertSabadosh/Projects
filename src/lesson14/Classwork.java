package lesson14;

public class Classwork {

    public static void main(String[] args) {

        //findHappyDumpling();
        //findVariables();
        //myLine();
        //alphabet();
        //fibonacci();
        System.out.println(reverseNumber(123));
    }

    public static int sum(int number) {
        return 0;
    }

    public static int reverseNumber(int number) {
        String input = String.valueOf(number);
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.substring(i, i + 1);
            //System.out.print(output);
        }
        int result = Integer.parseInt(output);
        return result;
    }

    public static void fibonacci() {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }

    public static void findHappyDumpling() {
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                System.out.println("Вот счастливый пельмень");
            }
        }
    }

    public static void findVariables() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void myLine() {
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
    }

    public static void alphabet() {
        for (int i = 65; i <= 90; i++) {
            char char1 = (char) i;
            String str = String.valueOf(char1);
            System.out.println(repeatSymbol(str, 4));
        }
    }

    public static String repeatSymbol(String symbol, int repeatNumber) {
        String output = "";
        for (int i = 0; i < repeatNumber; i++) {
            output += symbol;
        }
        return output;
    }
}
