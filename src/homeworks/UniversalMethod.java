package homeworks;

public class UniversalMethod {

    public static void main(String[] args) {
        split();
        /*int[] myArray = new int[0];
        myArrayPrint(myArray);*/
    }

    public static void split() {
        System.out.println("----------------------------");
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
