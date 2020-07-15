package lesson14;

public class MyLovelyPrimeNumber {

    public static void main(String[] args) {
        int test1 = 137;

//        System.out.println(primeNumberOne(test1));
//        System.out.println("------------------");
//        listMePrimeNumber(500);
//        System.out.println("------------------");
        primeNumberTwo(100);
    }

    public static boolean primeNumberOne(int myCheckNumber) {
        for (int i = 2; i < myCheckNumber; i++) {
            if (myCheckNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void listMePrimeNumber(int range) {
        for (int i = 2; i < range; i++) {
            if (primeNumberOne(i)) {
                System.out.println(i);
            }
        }
    }

    public static void primeNumberTwo(int range) {
        for (int i = 2; i <= range; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    count++;
            }
            if (count < 2)
                System.out.println(i);
        }
    }


}
