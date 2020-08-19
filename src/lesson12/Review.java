package lesson12;

public class Review {

    public static void main(String[] args) {

        int n = 10;
        triangle(n);
    }

    public static void triangle(int countLine){
        String star = "*";
        String line = "";
//        line = star + star + star;
//        System.out.println(line);

        for (int i = 0; i < countLine; i++) {
            line +=star;
            // line = line + star;
            System.out.println(line);
        }
    }
}
