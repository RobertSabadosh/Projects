package lesson25;

public class ClassWork {
    public static void main(String[] args) {

        int myLovelyBinaryDigit = 0b0100_1110;
        System.out.println(convertToDecimal(myLovelyBinaryDigit));

    }

    public static int convertToDecimal(int binaryDigit) {
        int decimalDigit = 0;
        int n = 0;
        int temp = 0;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;
            decimalDigit += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }

        return decimalDigit;
    }
}
