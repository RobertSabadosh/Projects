package lesson12;

public class Homework11 {

    public static void main(String[] args) {

        System.out.println(parrotTrouble(true, 6)); // true
        System.out.println(parrotTrouble(true, 7)); // false
        System.out.println(parrotTrouble(false, 6)); // false

    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 24) {
            if ((hour < 7 || hour > 20) && talking) {
                return true;
            }
        }
        return false;
        //return (talking && (hour < 7 || hour > 20));
    }
}
