package lesson07;

public class Baikonur {
    public static void main(String[] args) {
        double shuttleSpeedOne = 5.0;
        double shuttleSpeedTwo = 15.1;

        shuttleStart(shuttleSpeedOne);
        split();
        shuttleStart(shuttleSpeedTwo);
    }

    private static void split() {
        System.out.println("------------------------");
    }

    public static void shuttleStart(double spped) {
        final double SUPERCONSTANT_G = 10.0;

        if (spped<SUPERCONSTANT_G){
            System.out.println("Первоначальное ускорение недостаточно"+ '\n'
                    + "Ракета не может стартовать" +'\n'
                    + "Ракета не может стартовать");
            System.out.println("подготовить аварийные службы");
        }else {
            System.out.println("Ракета улетает в косом" + '\n'
                    + "Выпустить пресс-релиз об успеном запуске" + '\n'
                    + "Подготовить великих программистов к гос наградам");
        }

    }
}
