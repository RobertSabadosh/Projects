package homeworks;

public class Homework04 {

    public static void main(String[] args) {
        presentation();
        split();
        fullInfo();
        split();
        noEntry();
        split();
        toUpperCase();

    }

    private static void split() {
        System.out.println("-------------------------------------");
    }

    public static void presentation() {
        String firstName = "Robert";
        String lastName = "Sabadosh";
        String profession = "Full stack developer";
        System.out.println(firstName + " " + lastName + " - " + profession);
        System.out.println("Robert Sabadosh - Full stack developer");
    }

    public static void fullInfo() {
        String firstName = "Robert";
        String lastName = "Sabadosh";
        int age = 27;
        String street = "Berlinerstrasse 37";
        int postcode = 38563;
        System.out.println("- Имя пользователя: " + firstName);
        System.out.println("- Фамилия пользователя: " + lastName);
        System.out.println("- Возраст пользователя: " + age);
        System.out.println("- Улица пользователя: " + street);
        System.out.println("- Почтовый индекс пользователя: " + postcode);
        System.out.println("-----------------------------------------");
        System.out.println("- Имя пользователя: " + firstName + '\n' +
                "- Фамилия пользователя: " + lastName + '\n' +
                "- Возраст пользователя: " + age + '\n' +
                "- Улица пользователя: " + street + '\n' +
                "- Почтовый индекс пользователя: " + postcode);
    }

    public static void noEntry(){
        String origin = "Вход разрёшен";
        //String alternativeOption = "воспрещён";
        int dlina = origin.length();
        System.out.println(origin);
        System.out.println(dlina);

        String changed = origin.substring(0,5) + "воспрещён";
        //String changed2 = origin.substring(0,5) + alternativeOption;
        System.out.println(changed);
        //System.out.println(changed2);
    }

    public static void toUpperCase(){
        String str = "осторожно, вход воспрещён";
        str = str.toUpperCase();
        System.out.println(str);
    }

}