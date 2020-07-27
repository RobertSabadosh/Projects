package lesson24;

public class EnigmaCaesar {

    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));
        //-> Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.
    }

    private static String enigmaCaesar(String input) {
        int key = 3;
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char symbol;
            // keep space dot and colon symbols
            if (input.charAt(i) == ' ') {
                symbol = (char) (input.codePointAt(i));
            } else if (input.charAt(i) == '.') {
                symbol = (char) (input.codePointAt(i));
            } else if (input.charAt(i) == ',') {
                symbol = (char) (input.codePointAt(i));
            } else if (input.charAt(i) == 'г') {
                symbol = (char) (input.codePointAt(i) + 30);
                // keep Д and Е at right place
            } else if (input.charAt(i) >= 'д' && input.charAt(i) <= 'е') {
                symbol = (char) (input.codePointAt(i) + key - 1);
                // use standard key
            } else if (input.charAt(i) < 'э') {
                symbol = (char) (input.codePointAt(i) + key);
                // put ё in the right position
            } else if (input.charAt(i) == 'ё') {
                symbol = (char) (input.codePointAt(i) - 28 + key);
                // put last characters to the front of alphabet
            } else {
                symbol = (char) (input.codePointAt(i) - 32 + key);
            }
            output = output + symbol;
        }
        return output;
    }
}


//Съешь же ещё этих мягких французских булок, да выпей чаю.
// Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.
//А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я
//Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я А Б В

