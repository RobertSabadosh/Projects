package lesson13;

public class Classwork013 {

    public static void main(String[] args) {

        int n = 10;
        //firstTriangle(n);
        secondTriangle(n);
    }

    public static void firstTriangle(int line) {
        String divider = " ";
        String output2 = "";
        String star = "*";
        String outputStar = "";
        for (int i = 0; i < line; i++) {
            //output += star;
            outputStar = outputStar + star;
            //output2 += divider;
            output2 = output2 + divider;
            System.out.println(outputStar);
            //System.out.println(output += star);
        }
        String empty = "";
        for (int i = 0; i < line; i++) {
            empty = outputStar.substring(0, line);
        }
        String finaleVariable = "";
        for (int i = 0; i < line; i++) {
            finaleVariable = outputStar.substring(0, outputStar.length() - i) + output2.substring(outputStar.length() - i);
            System.out.println(finaleVariable);
        }
    }

    public static void secondTriangle(int line) {
        String star = "*";
        String space = "          "; // тут 10 пробілів
        for (int i = 0; i < line; i++) {
            space += star;
            space = space.substring(1, space.length() - 1);
            System.out.println(space += star);
        }
    }
}
