package lesson24;

public class Caesar {

    public static void main(String[] args) {
        String input = "Съешь же ещё этих мягких французских булок, да выпей чаю.";
        String output = "Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.";
        // "а" = г
        // "а" = г
        // "е" = г
        System.out.println(enigmaCaesar(input));
        String outputFromMethod = enigmaCaesar(input);
        System.out.println(output.equals(outputFromMethod));
    }

    public static String enigmaCaesar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + genCaesarSymbol(input.charAt(i));
        }
        return output;
    }

    public static String genCaesarSymbol(char symbol) {
        int key = 3;
        char result = (char) (symbol + key);
        if (symbol == ' ') {
            result = ' ';
        } else if (symbol == '.') {
            result = '.';
        } else if (symbol == ',') {
            result = ',';
        } else if (symbol == '!') {
            result = '!';
        } else if (symbol == 'э') {
            result = 'а';
        } else if (symbol == 'ю') {
            result = 'б';
        } else if (symbol == 'я') {
            result = 'в';
        } else if (symbol == 'ё') {
            result = 'и';
        } else if (symbol == 'г') {
            result = 'ё';
        }
        return String.valueOf(result);
    }

    public static String enigmaCaesarNotEnough(String input) {
        input = input.toUpperCase();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = result + genCaesarCharNotEnough(input.charAt(i));
        }
        return result;
    }

    private static char genCaesarCharNotEnough(char oneLetter) {
        char outputPlusThree = (char) (oneLetter + 3);
        char result;
        switch (oneLetter) {
            case 'A':
                result = 'G';
                break;
            case 'B':
                result = 'G';
                break;
            case 'C':
                result = 'G';
                break;
            case 'D':
                result = 'G';
                break;
            case 'E':
                result = 'G';
                break;
            case 'F':
                result = 'G';
                break;
            case 'G':
                result = 'G';
                break;
            case 'I':
                result = 'G';
                break;
        }
        return outputPlusThree;
    }
}