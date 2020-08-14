import lesson04.Calculator;

public class Main {


    public static void main(String[] args) {
        split();
        String s1="javatpoint is a very good website";
        String replaceString=s1.replace('a','e');//replaces all occurrences of a to e
        System.out.println(replaceString);

    }



    public static void customerInfo() {
        //System.out.println("С вас 3,60€!");

    }

    public static String minCat(String str1, String str2) {
        if (str1.length() == str2.length())
            return str1 + str2;
        if (str1.length() > str2.length()) {
            int diff = str1.length() - str2.length();
            return str1.substring(diff, str1.length()) + str2;
        } else {
            int diff = str2.length() - str1.length();
            return str1 + str2.substring(diff, str2.length());
        }
    }

    public static void split(){
        System.out.println("-------------------------");
    }

    /* public static void thankYou() {
        System.out.println("Спасибо за покупку!");
        System.out.println("А здесь будет выполняться арифметическая операция 3+5" + 5 + 3);
        System.out.print("Меня зовут Андрей \t");
        System.out.print("Но я хочу \nбыть Сергеем");
        System.out.print("ln = New Line");
        System.out.print("\n");
        System.out.print("\u0423\u0440\u0430 \n");

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("() {} [] /\\ '' \" ~ +-/* & ^ <> | ");
        System.out.println(" Домашнее задание: научить пальчики вызывать различные смешные символы");
        System.out.println();
        customerInfo();
        thankYou();
    }*/
}
