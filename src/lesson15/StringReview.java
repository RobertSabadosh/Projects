package lesson15;

public class StringReview {

    public static void main(String[] args) {

        review();
        split();
        review2();
        split();
        review3();
        split();
        review4();
        split();
        review5();

    }

    public static void review() {
        String number = "101";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }

    public static void review2() {
        double pi = 3.14;
        String myPi = String.valueOf(pi);
        String newString = myPi + "Robert";
        double newDigit = Double.parseDouble(myPi);
        System.out.println(newDigit);
    }

    public static void review3() {
        String name = "Andrej";
        char myChar = name.charAt(2);
        System.out.println(myChar);
    }

    public static void review4() {
        String hello = "Hello";
        String output = hello.substring(hello.length() - 2);
        System.out.println(output);
        char test = hello.charAt(hello.length() - 2);
        System.out.println(test);
    }

    public static void review5(){
        String testString = "13-ая группа";
        int result = testString.codePointAt(4);
        System.out.println(result);
    }

    public static void review6(){
        String str = "I love Java";
        int result =0 ;
    }

    public static void split() {
        System.out.println("------------------");
    }

}
