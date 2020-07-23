package lesson19;

public class Main {

    public static void main(String[] args) {
        System.out.println(myReplace("Василий", 'г', 4));
    }

    public static String myReplace(String input, char toReplace, int index) {
        input = input.substring(0, index) + toReplace + input.substring(index + 1);
        return input;
    }
}
