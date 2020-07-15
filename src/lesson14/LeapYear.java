package lesson14;

public class LeapYear {

    public static void main(String[] args) {

        // System.out.println(findSimpleLeapYear(1999));
        System.out.println(findHarderLeapYear(2000));
    }

    public static boolean findSimpleLeapYear(int year) {
        return year % 4 == 0;
    }

    public static boolean findHarderLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else return false;
    }

    public static boolean myLovelyLeapYearWithBoolean(int year) {
        return (year % 400 == 0) || (year % 4 == 0) ^ (year % 100 == 0);
        //return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
    }
}