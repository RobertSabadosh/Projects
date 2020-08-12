package lesson37;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        int[][] array = new int[5][6];
        createArray(array);
        printOneLine(array);
        PifagorTable.printTwoDimensionalArray(array);
    }

    public static int[][] createArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    public static void printOneLine(int[][] arr) {
        for (int i = 0; i < arr[2].length; i++) {
            System.out.print(arr[2][i] + " ");
        }
        System.out.println();
    }
}
