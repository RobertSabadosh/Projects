package lesson04;

public class CalculatorTest {

    public static void main(String[] args) {

        int test = Calculator.addition(3, 5);
        System.out.println("Ожидаю 8, метод из калькулятора = "
                + test);

        double secondTest = Calculator.division(7, 10);
        System.out.println("Ожидаю  что то меньше нуля, метод из калькулятора = "
                + secondTest);
    }
}
