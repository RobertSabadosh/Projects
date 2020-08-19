package lesson19;

public class AlpTraum {

    public static void main(String[] args) {

        System.out.println(plusOut("Andrej", "an"));
    }

    public static String plusOut(String bigWord, String shortWord) {
        String result = bigWord;
        // 1. первым в резалт записываем плюсы.  ++++++++
        // 2. два цикла вложенных где перепроверяем сибволы ИНПУТА бигворда и шортворд
        // 3. Если символы совпадают, то только тогда мы перезаписываем в РЕЗАЛТЕ по индексу наш один совпавший символ.
        char plus = '+';
        for (int i = 0; i < bigWord.length(); i++) {
            for (int j = 0; j < shortWord.length(); j++) {
                //System.out.println("А нука " + i + " " + j + " " + (bigWord.charAt(i) == shortWord.charAt(j)));
                if (bigWord.charAt(i) != shortWord.charAt(j)) {
                    result = Main.myReplace(result, plus, i);
                }
            }
        }
        return result;
    }
}
