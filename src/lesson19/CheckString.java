package lesson19;

public class CheckString {
    public static void main(String[] args) {
        checkStringCyrillic("А роза упала на лапу Азора");
    }

    public static void checkStringCyrillic(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.codePointAt(i));
        }
    }
}
