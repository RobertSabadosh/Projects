package homeworks;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println(startWithHi("hi there")); // expecting true
        System.out.println(startWithHi("hi"));       // expecting true
        System.out.println(startWithHi("hello hi")); // expecting false
        split();
        /*System.out.println(startWithHi2("hi there"));
        System.out.println(startWithHi2("hi"));
        System.out.println(startWithHi2("hello hi"));*/
        split();
        System.out.println(hasTeen(13, 20, 10)); // expecting true
        System.out.println(hasTeen(10, 19, 10)); // expecting true
        System.out.println(hasTeen(20, 10, 13)); // expecting true
    }

    public static boolean startWithHi(String str) {
        if (str.length() < 2)
            return false;

        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19);
    }

   /* public static boolean startWithHi2(String str) {
        if (str.length() < 2)
            return false;
        String firstTwo = str.substring(0, 2);
        return firstTwo.equals("hi");
    }*/

    public static void split() {
        System.out.println("------------------------");
    }
}