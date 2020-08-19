package lesson20;

public class HW19 {

    public static void main(String[] args) {

        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b")); //→ true
        System.out.println(bobThere("bac"));// → false
    }

    public static boolean bobThere(String input) {
        char b = 'b';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == b && input.charAt(i + 2) == b) {
                return true;
            }
        }
        return false;
    }
}
