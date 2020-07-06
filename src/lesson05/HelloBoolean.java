package lesson05;

public class HelloBoolean {
    public static void main(String[] args) {
        int a = 1, b = 2;
        boolean bool = a <= b;
        System.out.println(bool);
        boolean anotherBool = !bool;
        System.out.println(anotherBool);
        split();
        // a & b
        // конъюнкция
        // логическое умножение, просто И, AND, & UND, &&


        boolean sun = true;
        boolean dad = false;
        boolean ice = sun & dad;
        boolean ice2 = sun && dad^bool&!anotherBool;
        System.out.println("Морожко " + ice);
        split();



        // a | b
        boolean mama = false;
        boolean papa = false;
        boolean walking = mama | papa;
        boolean walking2 = mama || papa;
        // OR , ODER, ИЛИ |, || дизъюнкция, сложение
        System.out.println("Прогулка в парке " + walking);
        split();

        boolean alps = false;
        boolean village = false;
        boolean relax = alps ^ village;
        System.out.println("Настоящий отдых " + relax);
        // a ^ b
        // антиваленц
        // XOR, EOR, EXOR, ^, ИСКЛЮЧИТЕЛЬНОЕ ИЛИ


        boolean yes = true;
        boolean no = !yes;

        //Negation , NOT, !
        // b=!a;

    }

    public static void split() {
        System.out.println("-------------------------");
    }
}
