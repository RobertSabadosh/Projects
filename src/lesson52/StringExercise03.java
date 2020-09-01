package lesson52;

public class StringExercise03 {

    public static void main(String[] args) {

        System.out.println(sumNumbers("abc123xyz"));// → 123
        System.out.println(sumNumbers("aa11b33"));// → 44
        System.out.println(sumNumbers("7 11")); //→ 18
        //0. create a variable sum
        //1. input in loop, iterate
        //2. check whether chars are digits
        //3. after a digit check a char, if digit, then sum
        //4. return sum
    }

    public static int sumNumbers(String input) {
        int sum = 0;
        int length = input.length();
        int start = -1;
        int end = 0;
        for (int i = 0; i < length; i++) {
            if (start == -1) {
                if (Character.isDigit(input.charAt(i))) {
                    start = i;
                    end = i + 1;
                }
            } else {
                if (Character.isDigit(input.charAt(i))) {
                    end++;
                } else {
                    sum += Integer.parseInt(input.substring(start, end));
                    start = -1;
                }
            }
        }
        if (start != -1) {
            sum += Integer.parseInt(input.substring(start, end));
        }
        return sum;
    }

    public static int sumNumbersTwo(String input) {
        int sum = 0;
        String temp = "";
        String digit = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                temp += input.charAt(i);
            }
            System.out.println("temp " + temp);
            if (!Character.isDigit(input.charAt(i)) && temp.length() > 0) {
                digit = temp;
                temp = "";
            }
            // sum += Integer.parseInt(digit);
        }
        return sum;
    }
}
