package lesson32;

public class ReturnTypeReview {

    public static void main(String[] args) {

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int findElement(int[] a){
        return a[0];
    }

    public static int[] createArray(int a, int b){
        int[] array = new int[]{a,b};
        return array;
    }
}
