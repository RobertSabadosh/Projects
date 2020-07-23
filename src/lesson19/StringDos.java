package lesson19;

public class StringDos {

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb")); // 1
        System.out.println(countCode("codexxcode")); // 2
        System.out.println(countCode("cozexxcope")); // 2
        System.out.println(countCode("cozexxcope")); // 2

    }

    private static int countCode(String input) {
        String benchmark = "code";
        char c0 = 'c';
        char c1 = 'o';
        char c3 = 'e';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c0 && input.charAt(i + 1) == c1 && input.charAt(i + 3) == c3) {
                count++;
            }
        }
        return count;
    }
}
