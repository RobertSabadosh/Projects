package lesson30;

public class ArrayInit {

    public static void main(String[] args) {

        // Способ первый
        int[] var1 = new int[10];
        // Способ второй
        int[] var2 = new int[]{1, 5, 18};
        // Способ третий
        int[] var3 = var2;
        int a = 5;
        int b = a;
        int[] var4 = createAnArray(10);
        GoodMorningArraysDayTwo.myArrayPrint(var4);
    }

    public static int[] createAnArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }
}
