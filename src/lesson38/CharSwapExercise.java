package lesson38;

public class CharSwapExercise {

    static int count = 0;

    public static void main(String[] args) {

        char[] myArray = createArray(33);
        myPrint(myArray);
        char[] shakeArray = getShake(myArray);
        myPrint(shakeArray);
    }

    public static char[] getShake(char[] eingabe) {
        char[] result = new char[eingabe.length];
        //myCharDigitPrint(result);
        for (int i = 0; i < result.length; i++) {
            int newPlace = (int) (Math.random() * result.length);

            while (result[newPlace] != 0) {
                newPlace = (int) (Math.random() * result.length);
                count++;
            }
            result[newPlace] = eingabe[i];
        }
        System.out.println(count);
        return result;
    }

    public static void myCharDigitPrint(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + 0 + " ");
        }
        System.out.println();
    }

    public static void myPrint(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static char[] createArray(int length) {
        char[] output = new char[length];
        for (int i = 0; i < length; i++) {
            output[i] = myCyrillicChar();
        }
        return output;
    }

    public static char myCyrillicChar() {
        int min = 1072; // "a".codePointAt(0)
        int max = 1103;
        char randomCyrillicChar = (char) (Math.random() * ((max - min) + 1) + min);

        return randomCyrillicChar;
    }
}
