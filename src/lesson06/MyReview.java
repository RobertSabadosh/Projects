package lesson06;

public class MyReview {
    // Найти соотношение площади Беларуси к площади Украины.
    // Belarus 207,595
    // Ukraine 603,628

    public static void main(String[] args) {
        relations();
        double eberswalde = 58.17;
        double oranienburg = 16364;
        double relation = relationSquare(eberswalde, oranienburg);

        System.out.println("oranienburg to eberswalde " + relation);

        double pankow = 2000;
        double marzahn = 3000;
        double myLovelyRelation = relationSquare(pankow, marzahn);
        System.out.println(myLovelyRelation);

        String myBelarus = "Belarus asjhfadfhadl lsaijlfsadhgfoladgf liashfladshfl lsaikdhflsadgnvfh lsaihoglfs";
        int countSymbolsInBelarus = myBelarus.length();
        System.out.println("Здесь будет значение, которое посчитало количество элементов в ПЕРЕМЕННОЙ countSymbolsInBelarus = " + countSymbolsInBelarus);
        System.out.println(myBelarus.toUpperCase().substring(0, 3));
    }

    public static void relations() {
        double belarusSquare = 207595.0;
        double ukraineSquare = 603628.0;
        double relationBtoU = belarusSquare / ukraineSquare;
        System.out.println("Наше соотношение равно relationBtoU = " + relationBtoU);
    }

    public static double relationSquare(double square1, double square2) {
        return square1 / square2;
    }
}
