package lesson15;

public class Password {
    public static String genPass(int length) {
        String pass = "";
        for (int i = 0; i < length; i++) {
            //pass = pass + genDigit();
            pass = pass + genAlphabetAndNumeric();
        }
        return pass;
    }

    private static String genAlphabetAndNumeric() {
        String result = "";
        String input = "1234567890Авкгйфдфлгкйх!§%%&&&?:%фдлгйевоиревфжмьйдхкфгехортуиреофихадск";
        int myRandom = (int) (Math.random() * (input.length() - 1) + 1);
        char myChar = input.charAt(myRandom);
        result = String.valueOf(myChar);
        return result;
    }

    private static int genDigit() {
        int result = (int) (Math.random() * 10);
        return result;
    }

    private static char genChar() {
        int myRandom = (int) (Math.random() * ((90 - 65) + 1) + 65);
        return (char) myRandom;
    }

    private static String genString() {
        String result = "";
        double test = Math.random();
        boolean variable = false;
        if (test > 0.5) {
            variable = true;
        }
        if (variable) {
            result = String.valueOf(genChar()).toUpperCase();
        } else {
            result = String.valueOf(genChar()).toLowerCase();
        }
        return result;
    }
}
