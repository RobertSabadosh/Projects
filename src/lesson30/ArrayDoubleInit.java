package lesson30;

public class ArrayDoubleInit {

    public static void main(String[] args) {

        double[] doubleArray01 = new double[10];
        //printDoubleArray(doubleArray01);
        double[] doubleArray02 = fillMyDoubleArray(doubleArray01);
        printDoubleArray(doubleArray02);

    }

    public static double myRound(double d) {
        int temp = (int) (d * 100);
        double temp2 = temp;
        return temp2 / 100;
        //return (double) temp / 100;
    }

    private static double[] fillMyDoubleArray(double[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRound(Math.random());
        }
        return myArray;
    }

    public static void printDoubleArray(double[] input) {
        System.out.println("Массив дробей, длиной - " + input.length);
        for (double d : input) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}