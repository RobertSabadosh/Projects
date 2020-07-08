package lesson08;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println(findCurrencyCourse(("eur")));
        split();
        System.out.println(findTwoCurrencyCourse("USD", "BYN"));
        split();
        System.out.println(findCurrencySum(100, "EUR", "UAH"));

    }

    private static void split() {
        System.out.println("-------------------------");
    }

    public static double findCurrencySum(double amount, String inputName, String outputName) {
        return findTwoCurrencyCourse(inputName, outputName) * amount;
    }

    public static double findTwoCurrencyCourse(String firstCurrencyName, String secondCurrencyName) {
        return findCurrencyCourse(firstCurrencyName) / findCurrencyCourse(secondCurrencyName);
    }

    public static double findCurrencyCourse(String currencyName) {
        currencyName = currencyName.toUpperCase();
        double currencyCourse = 0.0;
        switch (currencyName) {
            case "EUR":
                currencyCourse = 1.12;
                break;
            case "RUR":
                currencyCourse = 0.014;
                break;
            case "USD":
                currencyCourse = 1.0;
                break;
            case "GBP":
                currencyCourse = 1.25;
                break;
            case "BYN":
                currencyCourse = 0.41;
                break;
            case "UAH":
                currencyCourse = 0.03;
                break;
            default:
                currencyCourse = 0.0;
                break;
        }
        return currencyCourse;
    }
}
