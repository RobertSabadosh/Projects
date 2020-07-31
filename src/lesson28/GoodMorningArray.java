package lesson28;

public class GoodMorningArray {

    public static void main(String[] args) {

        myFirstArray();
        germanCities();

    }

    public static void myFirstArray() {
        int[] myArray;
        String[] users;
        double[] gpsPoints;
        boolean[] permissions;
        char[] cyrillicAlphabet;
    }

    public static void mySecondtArray() {
        int myArray[];
        String users[];
        double gpsPoints[];
        boolean permissions[];
        char cyrillicAlphabet[];
    }

    public static void arrayFirstInitialisation() {
        String[] fourSeasons = new String[]{"Зима", "Vivaldi", "Чайковски", "Кинг", "Гостинница"};
        int[] numberFibonacci = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String[] capitalOfUdssr = new String[]{"Москва", "Минск", "Киев", "Кишенёв", "Тбилиси"};
        char[] cyrillic = new char[]{'а', 'б', 'в', 'г'};
        double[] time = new double[]{10.25, 15.45, 20.30};
    }

    public static void arraySecondInitialisation() {
        int[] field;
        field = new int[10]; // в массиве 10 ячеек
    }

    public static void germanCities() {
        String[] germanStates = new String[]
                {
                        "Berlin",
                        "Munchen",
                        "Dresden",
                        "Hamburg",
                        "Leipzig",
                        "Bremen",
                        "Frankfurt"
                };
        int length = germanStates.length;
        int allLetter =0;
        for (int i = 0; i < length; i++) {
            allLetter = allLetter + germanStates[i].length();

        }
        System.out.println(allLetter);
    }
}
