package lesson14;

public class WarmUpExercises {

    public static void main(String[] args) {

        // findHappyDumpling();
        //  findVariables();
        // myLine();
        // alphabet();
        // System.out.println(repeatSymbol("z", 10));
        // fibonacci();
        //String variable1 = "Andrey";
        //System.out.println(variable1.substring(0, 1));
        //System.out.println(reverseNumber(123));
    }

    public static int sumNumbers(int n) {
        return 0;
    }

    public static int reverseNumber(int n) {
        String input = String.valueOf(n);
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.substring(i, i + 1);
            // System.out.print(output);
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
                System.out.println("Here it is happy dumpling");
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
            String str1 = String.valueOf(char1);
            System.out.println(repeatSymbol(str1, 7));
        }
    }

    public static String repeatSymbol(String symbol, int repeatNumber) {
        String output = "";
        for (int i = 0; i < repeatNumber; i++) {
            output = output + symbol;
        }
        return output;
    }
}
