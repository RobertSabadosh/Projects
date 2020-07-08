package lesson08;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        //a = a + b;
        a += b; // спрощений запис попереднього варіанту
        System.out.println(a);
        a -= b;
        System.out.println(a);

        int d = 3;
        int f = 4;
        d *= f;
        System.out.println(d);
        d *= f;
        System.out.println(d);
        d /= f;
        System.out.println(d);

        d %= a;
        System.out.println(d);


    }

}
