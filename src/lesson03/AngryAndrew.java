package lesson03;


public class AngryAndrew {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;
        System.out.println("var3 = " + var3);

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5;
        System.out.println("var6 = " + var6);

        double var7 = var1 / var2;
        System.out.println("var7 = " + var7);

        double var25 = var1 / var4;
        System.out.println("var25 = " + var25);

        int var35 = (int) (var1 / var4);
        System.out.println("var35 = " + var35);
    }
}
