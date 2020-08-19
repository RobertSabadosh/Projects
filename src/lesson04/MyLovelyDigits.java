package lesson04;

public class MyLovelyDigits {

    public static void main(String[] args) {

        myDouble();
    }

    public static void myDouble() {
        double этоПростоНЕМОЯПЕРЕМЕННАЯ = Math.PI;
        System.out.println("myConst из библиотеки Math = " + этоПростоНЕМОЯПЕРЕМЕННАЯ);
        double myNewPi = myLovelyRound(этоПростоНЕМОЯПЕРЕМЕННАЯ);
        System.out.println("myNewPi округлённое значение = " + myNewPi);

        double myTestVariable = 32423.346543564;
        System.out.println("что то распечатываем" + myLovelyRound(myTestVariable));
    }

    public static double myLovelyRound(double digitsToRound) {
        double temp0 = digitsToRound * 100;
        System.out.println("1. Шаг первый умножаем на 100 - temp0 = " + temp0);

        int temp1 = (int) temp0;
        System.out.println("2. Шаг второй присваиваем значение double инту, отсекаем 'хвостик' temp1 = "
                + temp1);

        temp0 = temp1;

        System.out.println("3. Шаг три. Мы присваиваем наше интовое значение в double, что бы мы могли 'делить' = "
                + temp0);

        temp0 = temp0 / 100;

        System.out.println("4. Должен быть конечный результат = " + temp0);

        return temp0;
    }
}
