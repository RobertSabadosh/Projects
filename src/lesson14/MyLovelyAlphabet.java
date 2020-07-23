package lesson14;

public class MyLovelyAlphabet {

    public static void main(String[] args) {
        String variable1 = "a";
        String variable2 = "A";
        System.out.println();
        //System.out.println(variable1.charAt(0));

        String name = "AaZz";
        int n1 = name.charAt(0);
        int n2 = name.charAt(2);
        int n3 = name.charAt(1);
        int n4 = name.charAt(3);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        /*
        str1="2345";
            int x=str1.charAt(2)-'0';
            //here x=4;
         */
        for (int i = 67; i <= 120; i++) {
            char char1 = (char) i;
            String str = String.valueOf(char1);
            System.out.println(str.toUpperCase());
        }
    }
}
