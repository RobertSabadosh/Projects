package homeworks;

public class Homework05 {

    public static void main(String[] args) {

        boolean a = (7 + 8) * 5 > 7 + 8 * 5;
        System.out.println(a);

        boolean b = (7 + 8) * 4 != 7 + 4 * 5;
        System.out.println(b);
        boolean c = 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4;
        /// 7> 10 & 11>12
        System.out.println(c);
        boolean e = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;
        System.out.println(e);

        boolean f = !(3 * 4 < 7 + 8);
        System.out.println(f);
    }
}
