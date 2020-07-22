package lesson19;

public class CheckString {
    public static void main(String[] args) {

    }

    public static void checkStringCyrillic(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.codePointAt(i));
        }
    }
}
