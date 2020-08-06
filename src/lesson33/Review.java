package lesson33;

public class Review {

    public static void main(String[] args) {

        System.out.println(sum2(2, 3, 5));
        sum3("My first varargs", 2, 3, 4, 89);
        citiesTable("Berlin", "Munchen", "Dusseldorf", "Dresden");
        System.out.println(charToString('R', 'O', 'B', 'E', 'R', 'T'));

    }

    private static int sum1(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        return sum;
    }

    private static int sum2(int... allDigits) {
        int sum = 0;
        for (int i = 0; i < allDigits.length; i++) {
            sum += allDigits[i];
        }
        return sum;
    }

    private static void sum3(String name, int... allDigits) {
        int sum = 0;
        for (int i = 0; i < allDigits.length; i++) {
            sum += allDigits[i];
        }
        System.out.println(name + " " + sum);
    }

    public static void citiesTable(String... cities) {
        for (String element : cities) {
            System.out.println(element);
        }
    }

    public static String charToString(char... symbols) {
        String output = "";
        for (int i = 0; i < symbols.length; i++) {
            output += symbols[i];
        }
        return output;
    }
}