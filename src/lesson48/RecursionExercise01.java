package lesson48;

public class RecursionExercise01 {

    public static void main(String[] args) {
        System.out.println(countX("xxhixx")); //→ 4
        System.out.println(countX("xhixhix")); //→ 3
        System.out.println(countX("hi")); //→ 0
        System.out.println("------------------");
        System.out.println(changePi("xpix")); //"x3.14x"
        System.out.println(changePi("pipi"));// → "3.143.14"
        System.out.println(changePi("pip"));// → "3.14p"
    }

    public static String changePi(String input) {
        if (input.length() < 2) {
            return input;
        }
        if (input.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(input.substring(2));
        }
        return input.charAt(0) + changePi(input.substring(1));
    }

    public static int countX(String input) {
        if (input.length() == 0) {
            return 0;
        }
        if (input.charAt(0) == 'x') {
            return 1 + countX(input.substring(1));
        }
        return countX(input.substring(1));
    }
}
