package lesson27;

public class HW26 {

    public static void main(String[] args) {

        System.out.println(starOut("ab*cd")); // "ad"
        System.out.println(starOut("ab**cd")); // "ad"
        System.out.println(starOut("sm*eilly")); // "silly"

    }

    /*Return a version of the given string, where for every star () in the string the star and the chars immediately to its left and right
    are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".*/
    public static String starOut(String str) {
        String output = "";
        char star = '*';

        for (int i = 0; i < str.length(); i++) {
            // одна звёздочка, то
            if (str.charAt(i) == star && str.charAt(i - 1) != star) { // логическая ловушка с i-1
                // то вырежи символ справа и слева звёздочку
                // две звёздочки звёздочка, то
                output = str.substring(0, i - 1) + str.substring(i + 2);
            } else if (str.charAt(i) == star && str.charAt(i - 1) == star) {
                // то вырежи символ справа и слева и эти  две звёздочки
                output = str.substring(0, i - 2) + str.substring(i + 2);
            }
        }
        return output;
    }
}
