package lesson13;

public class Geometry {
    public static void main(String[] args) {
        first("*", 10);
        //second();
    }

    public static void first(String divider, int countLine) {
        String line = "";
        for (int i = 0; i < countLine; i++) {
            line = line + divider;
            //System.out.println(line);
        }
    }

    public static void second(String divider, int countLine) {
        String line = "";
        for (int i = 0; i < countLine; i++) {
            line = line + divider;
        }

    }
}
