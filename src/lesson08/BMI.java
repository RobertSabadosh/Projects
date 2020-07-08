package lesson08;

public class BMI {
    public static void main(String[] args) {
        double height = 176.0;
        double weight = 100.0;
        System.out.println(findBmi(height, weight));
    }

    public static double findBmi(double height, double weight) {
        height /= 100; // height = height / 100;
        return weight / (height * height);
        //double result = weight / (height * height);
        //return result;
    }
}
