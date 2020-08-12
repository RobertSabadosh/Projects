package lesson37;

public class MyLovelyArray {

    public static void main(String[] args) {

        myLovelyTwoDimensionalStringArray();
    }

    public static void myLovelyTwoDimensionalStringArray() {
        String[][] myArray = new String[5][3];
        myArray[0][0] = "1";
        myArray[0][0] = "Матвеев";
        myArray[0][0] = "№8458798439";

        myArray[1][0] = "2";
        myArray[1][1] = "Васечкин";
        myArray[1][2] = "№83748432";

        myArray[2][0] = "3";
        myArray[2][1] = "Петечкин";
        myArray[2][2] = "№2435";

        myArray[3][0] = "4";
        myArray[3][1] = "Сидоров";
        myArray[3][2] = "№876543";

        myArray[4][0] = "5";
        myArray[4][1] = "Герасимов";
        myArray[4][2] = "№8765";

        myPrintForStringTwoD(myArray);
    }

    public static void myPrintForStringTwoD(String[][] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
            }
        }
    }


}
