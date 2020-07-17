package lesson15;

public class Password {
    public static void main(String[] args) {
        System.out.println(genPass(20));

    }

    public static String genPass(int length){
        String pass = "";
        for (int i = 0; i < length; i++) {
            pass += genChar();
        }
        return pass;
    }

    private static char genChar() {
        int myRandom = (int) (Math.random()*((90-65)+1) + 65);
        return (char) myRandom;
    }

    private static String genString(){
        String result = "";
        if (true){
            result = String.valueOf(genChar());
        }


        return "";
    }
}
