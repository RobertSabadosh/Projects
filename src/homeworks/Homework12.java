package homeworks;

public class Homework12 {
    public static void main(String[] args) {
        int n = 10;
        mirroredTriangle(n);
    }

    public static void mirroredTriangle(int countLine) {
        for (int i = 0; i <= countLine; i++) {
            for (int j = 0; j < countLine - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}