package lesson52;

import java.util.Arrays;

public class StringSort {

    public static void main(String[] args) {

        String[] cities = {
                "Berlin",
                "Могилев",
                "München",
                "Düsseldorf",
                "Hamburg",
                "Köln",
                "Frankfurt",
                "Leipzig"
        };
        System.out.println(Arrays.toString(cities));
        bubbleSort(cities);
        System.out.println(Arrays.toString(cities));
    }

    public static String[] bubbleSort(String[] cities) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < cities.length - 1; i++) {
                if (cities[i].charAt(0) > cities[i + 1].charAt(0)) {
                    String temp = cities[i];
                    cities[i] = cities[i + 1];
                    cities[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
        return cities;
    }
}
