package lesson07;

public class CoffeeVending {

    public static void main(String[] args) {

        int customerChooseOne = 11;
        int customerChooseTwo = 12;
        int customerChooseThree = 13;
        int customerChooseFour = 14;
        coffeeSwitch(customerChooseOne);
        split();
        coffeeSwitch(customerChooseTwo);
        split();
        coffeeSwitch(customerChooseThree);
        split();
        coffeeSwitch(customerChooseFour);
    }

    public static void split() {
        System.out.println("-----------------------");
    }

    public static void coffeeSwitch(int customerChoose) {
        String result = "";
        switch (customerChoose) {
            case 11:
                CoffeeRecipes.americano();
                break;
            case 12:
                CoffeeRecipes.cappuccino();
                break;
            case 13:
                CoffeeRecipes.latte();
                break;
            case 14:
                CoffeeRecipes.hotWater();
            default:
                System.out.println("");
                break;
        }
    }
}
