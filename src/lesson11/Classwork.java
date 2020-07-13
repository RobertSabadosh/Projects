package lesson11;

public class Classwork {
    public static void main(String[] args) {

        System.out.println(smartDepositBox(true, false)); // expecting true
        System.out.println(smartDepositBox(false, true)); // expecting true
        System.out.println(smartDepositBox(false, false)); // expecting false
        split();
        System.out.println(smartDepositBox2(true, false)); // expecting false
        System.out.println(smartDepositBox2(false, true)); // expecting false
        System.out.println(smartDepositBox2(false, false)); // expecting false
        System.out.println(smartDepositBox2(true, true)); // expecting true
        split();
        System.out.println(bigBadaBoom(true, true)); // expecting true
        System.out.println(bigBadaBoom(false, false)); // expecting false
        System.out.println(bigBadaBoom(true, false)); // expecting false
    }

    public static void split(){
        System.out.println("---------------------------");
    }

    public static boolean smartDepositBox(boolean mamaTouch, boolean papaTouch){
        // return mamaTouch || papaTouch;
        if (mamaTouch || papaTouch){
            return true;
        }else {
            return false;
        }
    }

    public static boolean smartDepositBox2(boolean mamaTouch, boolean papaTouch){
        return mamaTouch && papaTouch;
    }

    public static boolean bigBadaBoom(boolean captain1, boolean captain2){
        return captain1 && captain2;
    }

    
}
