package lesson39;

public class MyBreak {

    public static void main(String[] args) {

        boolean stopLockdown = true;
        quarantineMethod(stopLockdown);
        //quarantineMethod(!stopLockdown);
    }

    private static void quarantineMethod(boolean stopLockDown) {
        // создание карантинной зоны
        int a = 10;
        {
            int temp = 7;
            a = a + temp;
        }
        System.out.println(a);
        quarantineZone:
        {
            if (stopLockDown) {
                System.out.println("Ура карантин закончен");
                break quarantineZone;// выход из зоны карантина
            }
            System.out.println("Мы в карантине");
        }
    }
}
