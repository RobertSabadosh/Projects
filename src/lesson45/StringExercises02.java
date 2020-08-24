package lesson45;

import static homeworks.UniversalMethod.split;

public class StringExercises02 {

    public static void main(String[] args) {

        System.out.println(oneTwo("abc"));// → "bca"
        System.out.println(oneTwo("tca")); // → "cat"
        System.out.println(oneTwo("tcagdo"));  // → "catdog"
        System.out.println(oneTwo("telran!?"));  // → "eltanr"
        split();
        System.out.println(catDog("catdog"));// → true
        System.out.println(catDog("catcat"));// → false
        System.out.println(catDog("1cat1cadodog"));// → true
        System.out.println(catDog("catdogdog"));// → false
        split();
        System.out.println(xyzThere("abcxyz"));// → true
        System.out.println(xyzThere("abc.xyz"));// → false
        System.out.println(xyzThere("xyz.abc"));// → true
        split();
        System.out.println(mixString("abc", "xyz"));// → "axbycz"
        System.out.println(mixString("Hi", "There"));// → "HTihere"
        System.out.println(mixString("xxxx", "There"));// → "xTxhxexre"
        split();
        System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"
    }

    public static String oneTwo(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i = i + 3) {
            if (str.length() - i < 3) {
                //nothing
            } else {
                output = output + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
            }
        }
        return output;
    }

    // Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
    // separated by the separator string.
    // Учитывая две строки, слово и разделитель sep, вернуть большую строку, состоящую из количества вхождений слова,
    // разделенных строкой-разделителем.

    public static String repeatSeparator(String a, String b, int count) {
        StringBuilder output = new StringBuilder(a);
        if (count > 1) {
            for (int i = 1; i < count; i++) {
                output.append(b).append(a);
            }
        }
        return output.toString();
    }

    // Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
    // the second char of b, and so on. Any leftover chars go at the end of the result.
    // Учитывая две строки, a и b, создайте строку большего размера, состоящую из первого символа a, первого символа b,
    // второго символа a, второго символа b и т. Д. Любые оставшиеся символы помещаются в конец результата.

    public static String mixString(String a, String b) {
        StringBuilder output = new StringBuilder();
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            output.append(a.charAt(i)).append(b.charAt(i));
        }
        if (b.length() > a.length()) {
            output.append(b.substring(len));

        } else if (b.length() < a.length()) {
            output.append(a.substring(len));
        }
        return output.toString();
    }

    //  Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
    //  So "xxyz" counts but "x.xyz" does not.
    //  Вернуть истину, если данная строка содержит вид «xyz», где перед xyz не ставится точка (.).
    //  Так «xxyz» считается, а «x.xyz» - нет.

    public static boolean xyzThere(String str) {
        if (str.contains(".xyz")) {
            return false;
        } else if (str.contains("xyz")) {
            return true;
        }
        return false;
    }

    // Return true if the string "cat" and "dog" appear the same number of times in the given string.
    // Вернуть истину, если строки «кошка» и «собака» встречаются в данной строке одинаковое количество раз.

    public static boolean catDog(String str) {
        int countDog = 0;
        int countCat = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                countDog++;
            } else if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
        }
        //return str.contains("dog") && str.contains("cat");
        return countDog == countCat;
    }
}
