package homeworks;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println(heroChoice("left"));
        System.out.println(heroChoice("right"));
        System.out.println(heroChoice("straight"));
        split();
        int speed = 129;
        split();
        System.out.println(speedLimit2(46));
        System.out.println(speedLimit2(56));
        System.out.println(speedLimit2(80));
        System.out.println(speedLimit2(120));
        split();
        System.out.println(heroChoice2(1));
        System.out.println(heroChoice2(2));
        System.out.println(heroChoice2(3));
        System.out.println(heroChoice2(4));
        split();

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

    public static String heroChoice2(int way){
        String result = "";
        if (way==1){
            result = "Коня потеряешь";
        }else if (way==2){
            result = "Жизнь потеряешь";
        }else if (way==3){
            result = "Счастье обретёшь";
        }else {
            result = "Спроси ещё";
        }
        return result;
    }

    public static String speedLimit3(int speed) {
        String result = "";
        if (speed <= 50) {
            result = "Нет нарушений";
        } else if (speed <= 65) {
            result = "устное порицание и лекция на 5 минут";
        }else if(speed<=100) {
            result =  "40 Евро штраф";
        }else if (speed<=130) {
            result =  "штраф 500 евро";
        }else{
            result =   "штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства";
        }
        return result;
    }


    public static String speedLimit2(int speed) {
        if (speed <= 50) {
            return "Нет нарушений";
        } else if (speed <= 65) {
            return "устное порицание и лекция на 5 минут";
        }else if(speed<=100) {
            return "40 Евро штраф";
        }else if (speed<=130) {
            return "штраф 500 евро";
        }else{
           return  "штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства";
        }
    }

    public static void speedLimit(int speed) {

        if (speed <= 50) {
            System.out.println("Нет нарушений");

        } else if (speed <= 65) { // Java не нравится что здесь написано speed >= 50, но по условию должно быть
            System.out.println("устное порицание и лекция на 5 минут");

        } else if (speed >= 100 && speed <= 130) {
            System.out.println("штраф 500 евро");

        } else if (speed > 130) {
            System.out.println("штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства");
        }
    }
}
