package lesson19;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(checkPalindrome("А роза упала на лапу Азора")); // expecting true
        System.out.println(checkPalindrome("поп")); // expecting true
        System.out.println(checkPalindrome("школа")); // expecting false
        //System.out.println(deleteSpace("А роза упала на лапу Азора"));
    }

    public static boolean checkPalindrome(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        input = deleteSpace(input.toLowerCase());
        output = deleteSpace(output).toLowerCase();
        return input.equals(output);
    }

    public static String deleteSpace(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            //if (!(input.substring(i, i + 1).equals(" "))) {
            if (input.charAt(i) != ' ' ){
                output = output + input.charAt(i);
            }
        }
        return output;
    }
}
