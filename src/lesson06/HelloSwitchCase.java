package lesson06;

public class HelloSwitchCase {
    public static void main(String[] args) {
        int customerValue1 = 999;
        int customerValue2 = 5;
        int customerValue3 = 76;
        String fromCoffeeVendingMachine = coffeeVending(customerValue1);
        System.out.println(fromCoffeeVendingMachine);
        split();
        System.out.println(coffeeVending(customerValue2));
        split();
        System.out.println(coffeeVending(customerValue3));
    }

    public static void split() {
        System.out.println("------------------");
    }

    public static String coffeeVending(int customerValue) {
        String result = "";
        switch (customerValue) {
            case 41:
                result = "Кофе американо готовится";
                break;
            case 42:
                result = "Кипяток сейчас будет";
                break;
            case 44:
                result = "Кофе эспрессо готовится";
                break;
            case 76:
                result = "Какао уже в пути";
                break;
            case 58:
                result = "Вода кипятится" + "\n"
                        + "Кофе мелется" + "\n"
                        + "Сливки добавляются" + "\n"
                        + "Настроение подымается";
                break;
            default:
                result = "Повторите пожалуйста свой выбор: "
                        + customerValue + " временно недоступен";
                break;
        }
        // System.out.println("Программа приготовления кофе отработана без ошибок");

        return result;
    }
}

