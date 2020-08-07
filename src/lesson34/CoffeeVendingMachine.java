package lesson34;


public class CoffeeVendingMachine {
    public static void main(String[] args) {
        String input = args[0];
        switch (input){
            case "hot water":
                CoffeeRecipes.hotWater();
                break;
            case "latte":
                CoffeeRecipes.latte();
                break;
            case "cappuccino":
                CoffeeRecipes.cappuccino();
                break;
            case "americano":
                CoffeeRecipes.americano();
                break;
            default:
                System.out.println("please choose again");
                break;
        }
    }
}