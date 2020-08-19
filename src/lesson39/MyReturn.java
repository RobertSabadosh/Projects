package lesson39;

public class MyReturn {

    public static void main(String[] args) {

        quarantine(false);
    }

    static void quarantine(boolean quarantine) {
        quarantineZone:
        {
            if (quarantine) {
                return; // выход из программы
            }
            System.out.println("Мы в картантине");
        }
    }
}
