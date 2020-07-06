package lesson06;

public class MyReViewTwo {
    public static void main(String[] args) {
        //booleanReview();
        boolean идётДождь = false;
        boolean мыМожемКопать = !идётДождь;
        System.out.println(мыМожемКопать);
    }

    public static void booleanReview() {
        // Конъюнкция  - & -  амперсанд
        // Дизъюнкция  - | -  "пайплайн"
        // Антиваленц  - ^ -  "домик"
        // Отрицание  -  ! -

        // У нас есть шансы найти работу на рынке. Два условия:
        // 1. у нас должны быть хорошие знания, что бы могли пройти собеседование
        // 2. место должно быть свободным, то есть нас должны искать.

        boolean knowledge, freeWorkSpace, myNewJob;

        knowledge = true;
        freeWorkSpace = false;

        myNewJob = knowledge & freeWorkSpace;
        System.out.println(myNewJob);


        boolean permissionMother, permissionFather, walkingBoy;
        permissionFather = false;
        permissionMother = true;

        walkingBoy = permissionMother | permissionFather;

        System.out.println(walkingBoy);


    }

    public static void review1() {
        int countStudents = 1;
        byte countMoney; // 256 - -128 do 127
        short firstvariable = 34;
        short secondvariable = 34;
        short s = (short) (secondvariable + firstvariable);
        long l = 57324590834L; // 2^63  - 1;
        int money = 10;
        int iphonePrise = 1000;
        int division = money / iphonePrise;
        System.out.println(division);
        double myLovelyDouble = 3.14;
        System.out.println(10.0 / 1000);
        System.out.println(Math.sqrt(myLovelyDouble));
        float myFloat = 45.9f;
    }

    public static void review2() {
        String myFirstShortString = "Мой пример строкового значения";
        int dlina = myFirstShortString.length();
        String myNewString = myFirstShortString.substring(0, 15);
        System.out.println("Привет мир " + myFirstShortString);

        char c1 = '@';
        char c2 = 115;
        char c3 = '\u0440';
        String space1 = " ";
        char c = ' ';

        System.out.println("" + c1 + c2 + c3);
    }
}
