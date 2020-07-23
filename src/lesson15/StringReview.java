package lesson15;

public class StringReview {

    public static void main(String[] args) {
/*        review1();
        split();
        review2();
        split();
        review3();
        split();
        review4();*/
        //review6();
        review10();
    }

    public static void review10() {
        String hello = "Привет";
        hello = hello.concat(" Мир");
        hello = hello + " Mir";
        System.out.println(hello);
    }

    //compareToIgnoreCase(String str) - пример использования
    public static void review9() {
        String str1 = "Строка для теста";
        String str2 = "сТрОкА дЛя тЕсТа";
        String str3 = "Другая строка для теста";

        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str3.compareToIgnoreCase(str1);
        System.out.println(result);
    }


    // compareTo(String anotherString) - пример использования
    public static void review8() {
        String str1 = "Строка для теста";
        String str2 = "Строка для теста";
        String str3 = "Другая строка для теста";

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);
    }


    //codePointCount(int beginIndex, int endIndex) - пример использования
    public static void review7() {
        String str = "Мы учимся в школе Телран онлайн";
        int cpc = str.codePointCount(3, 10);
        System.out.println(cpc);
    }


    // codePointBefore(int index) - пример использования
    public static void review6() {
        String str = "I love Java";
        System.out.println(str.codePointBefore(5));

    }


    // codePointAt(int index) - пример использования
    public static void review5() {
        String testStr = "13-аАAя группа утро";
        int result = testStr.codePointAt(4);
        System.out.println(result);
    }

    // substring and char different
    public static void review4() {
        String hello = "Hello";
        String output = hello.substring(hello.length() - 1);
        System.out.println(output);
        char test = hello.charAt(hello.length() - 1);
        System.out.println(test);
    }


    //charat
    public static void review3() {
        String name = "Andrej";
        char myChar = name.charAt(2);
        System.out.println("Вторая из имени андрей" + myChar);
        String newString = "" + myChar + myChar + myChar;
        int myNewSum = myChar + myChar + myChar;
        System.out.println("" + myChar + myChar + myChar);
        System.out.println(newString);
        int myMagicInt = myChar;
        char myMagicCharTest1 = (char) myMagicInt;
        System.out.println(myMagicCharTest1);
    }

    // double to String
    public static void review2() {
        double pi = 3.14;
        String myPI = String.valueOf(pi);
        String newString = myPI + "Andrej";
        double newDigit = Double.parseDouble(myPI);
        System.out.println("Результат преобразования string to double = " + newDigit);
    }

    // String to int
    public static void review1() {
        String number = "101";
        int result = Integer.parseInt(number);
        System.out.println("Результат преобразования = " + result);
    }

    public static void split() {
        System.out.println("------------------");
    }

}
