package TestPackge;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        String[] theFellowshipOfTheRing = {"Frodo", "Sam", "Gandalf", "Legolas", "Gimli", "Aragorn", "Boromir", "Pippin", "Merry"};
        String[] badGuys = {"Sauron", "Saruman", "Balrog"};
        greeting(theFellowshipOfTheRing, badGuys);

    }

    private static void greeting(String[] good, String[] evil) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say your name");
        name = scanner.next();
        if (Arrays.asList(good).contains(name)) {
            System.out.println("Welcome my friend " + name);
        } else if (Arrays.asList(evil).contains(name)) {
            System.out.println("You shall not pass!!!!!");
        } else {
            System.out.println("You shall not pass!!!!!");
        }
        scanner.close();
    }
}
