package lesson37;

public class PifagorTable {

    public static void main(String[] args) {
        printTwoDimensionalArray(createMT(10));

    }

    public static void printTwoDimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //System.out.print(array[i][j] + " ");
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createMT(int length) {
        int[][] result = new int[length][length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }
}