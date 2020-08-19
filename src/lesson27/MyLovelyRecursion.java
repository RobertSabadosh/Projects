package lesson27;

import static homeworks.UniversalMethod.split;

public class MyLovelyRecursion {

    public static void main(String[] args) {

        System.out.println(bunnyEars2(0)); // 0
        System.out.println(bunnyEars2(1)); // 2
        System.out.println(bunnyEars2(2)); // 5
        split();
        System.out.println(bunnyEars2(0)); // 0
        System.out.println(bunnyEars2(1)); // 2
        System.out.println(bunnyEars2(2)); // 5
    }

    public static int bunnyEars2Simple(int rabbit) {
        /*int result = 0;
        if (rabbit % 2 == 0) {
            result = 3;
        } else {
            result = 2;
        }*/
        return rabbit * 2 + rabbit / 2;
    }

    public static int bunnyEars2(int rabbit) {
        if (rabbit == 0) {
            return 0;
        }
        if (rabbit % 2 == 1) {   // проверяем нечетность
            return 2 + bunnyEars2(rabbit - 1);
        }
        return 3 + bunnyEars2(rabbit - 1);  // остались только четные
    }
}
