package lesson22;

/*
Когда белки собираются на вечеринку, они любят сигары.
Вечеринка с белкой проходит успешно, когда количество сигар составляет от 40 до 60 включительно.
Если только это не выходные, в этом случае нет верхней границы по количеству сигар.
Возвращает true, если партия с заданными значениями является успешной, или ложной иным образом. 
 */
public class BooleanExercises {

    public static void main(String[] args) {
        /*System.out.println(cigarParty(30, false)); //false
        System.out.println(cigarParty(50, false));//true
        System.out.println(cigarParty(70, true));//true
        System.out.println(cigarParty(70, false));//false*/
        /*System.out.println(smartDepositBox(true, false)); //-> true
        System.out.println(smartDepositBox(false, true)); //-> true
        System.out.println(smartDepositBox(false, false)); //-> false*/
        /*System.out.println(smartDepositBoxVersionTwo(true, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, true));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(true, true));// -> true*/
       /* System.out.println(verySmartDepositBox(false, true, true));//true
        System.out.println(verySmartDepositBox(false, false, true));//true
        System.out.println(verySmartDepositBox(false, false, false));//false
        System.out.println(verySmartDepositBox(true, false, false));//false*/
        /*System.out.println(bigBadaBoom(true, true));// -> true
        System.out.println(bigBadaBoom(false, false));// -> false
        System.out.println(bigBadaBoom(true, false));// -> false*/
        /*System.out.println(doorbell(true, true));// -> false
        System.out.println(doorbell(false, false));// -> false
        System.out.println(doorbell(true, false));// -> true*/
        /*System.out.println(smartDoorCheckKey(true, true, true)); //false
        System.out.println(smartDoorCheckKey(true, true, false)); //false
        System.out.println(smartDoorCheckKey(false, false, true)); //true
        System.out.println(smartDoorCheckKey(true, false, true)); //false*/
       /* System.out.println(verySmartDoor(false, true, false));// -> true
        System.out.println(verySmartDoor(false, false, true));//-> true
        System.out.println(verySmartDoor(true, false, false));// -> true
        System.out.println(verySmartDoor(false, false, false));// -> false*/
       /*System.out.println(paris(11, 15));//-> false
        System.out.println(paris(11, 5));// -> true*/
        /*System.out.println(caughtSpeeding(60, false)); //→ 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true)); //→ 0
        System.out.println(caughtSpeeding(85, true)); //→ 1
        System.out.println(caughtSpeeding(85, false)); //→ 2*/
        /*System.out.println(love6(6, 4));// → true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true*/
        System.out.println(more20(20));// → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
        System.out.println(more20(40));// → false
        System.out.println(more20(41));// → true
    }

    public static boolean more20(int n) {
        return (n % 20 == 1) || (n % 20 == 2);
    }

    public static boolean love6(int a, int b) {
        return (a == 6) || (b == 6) || ((a + b) == 6) || Math.abs(a - b) == 6;
    }

    public static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else return 2;
    }

    public static boolean paris(int class1, int class2) {
        return (class1 + class2) < 25;
    }

    private static boolean verySmartDoor(boolean b0, boolean b1, boolean b2) {
        return b0 || b1 || b2;
    }

    private static boolean smartDoorCheckKey(boolean internet, boolean electricity, boolean simpleKey) {
        return !internet && !electricity && simpleKey;
    }

    public static boolean doorbell(boolean bell1, boolean bell2) {
        //return bell1 != bell2;
        return bell1 ^ bell2;
    }

    public static boolean bigBadaBoom(boolean cap1, boolean cap2) {
        return cap1 && cap2;
    }

    public static boolean verySmartDepositBox(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {
        return mamaPermission && papaPermission || omaPermission;
    }

    public static boolean smartDepositBoxVersionTwo(boolean mum, boolean dad) {
        return mum && dad;
    }

    public static boolean smartDepositBox(boolean mum, boolean dad) {
        return mum || dad;
    }

    public static boolean cigarParty(int n, boolean b) {
        if (n >= 40 && n <= 60) {
            return true;
        } else if (n > 60 && b) {
            return true;
        }
        return false;
    }
}