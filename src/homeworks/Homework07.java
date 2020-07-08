package homeworks;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println(heroChoice("left"));
        split();
        int speed = 101;
        speedLimit(speed);
    }

    private static void split() {
        System.out.println("----------------------");
    }

    public static String heroChoice(String way) {
        String path = "";
        switch (way) {
            case "left":
                path = "Поедешь налево — богатому быть";
                break;
            case "right":
                path = "Поедешь направо — убитому быть";
                break;
            case "straight":
                path = "Поедешь прямо — женатому быть";
                break;
            default:
                path = "Обратно дороги нет";
                break;
        }
        return path;
    }

    public static void speedLimit(int speed) {

        if (speed <= 50) {
            System.out.println("Нет нарушений");

        } else if (speed >= 50 && speed <= 65) { // Java не нравится что здесь написано speed >= 50, но по условию должно быть
            System.out.println("устное порицание и лекция на 5 минут");

        } else if (speed >= 100 && speed <= 130) {
            System.out.println("штраф 500 евро");

        } else if (speed > 130) {
            System.out.println("штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства");
        }
    }
}
