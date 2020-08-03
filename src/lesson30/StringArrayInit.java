package lesson30;

public class StringArrayInit {

    public static void main(String[] args) {

        String[] str = new String[10];
        // myPrintForStringArray(str);
        myPrintForStringArray(createRandomStringArray(10));
    }

    public static String[] createRandomStringArray(int n) {
        String[] result = new String[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = generateString(10).toLowerCase();
        }
        return result;
    }

    public static void myPrintForStringArray(String[] str) {
        System.out.println("Строковый массив, длиной - " + str.length);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }

    public static String generateString(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + oneLetter();
        }
        return result;
    }

    private static char oneLetter() {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return source.charAt((int) (Math.random() * source.length()));
    }
}