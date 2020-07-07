package lesson07;

public class HelloIfElse {
    public static void main(String[] args) {
        int customerAge = 15;
        alcoholPermissionTwo(customerAge);


        helloIf();
    }

    public static void alcoholPermissionTwo(int age){
        if(age<16){
            System.out.println("Alcohol no");
        }else if (age<18){ // age >= 16 & - зайвий код
            System.out.println("Beer OK");
        }
        else{
            System.out.println("Alcohol OK");
        }

    }


    public static void helloIf(){
        //boolean permission = false;
        if (false){
            System.out.println("Я поеду в летний лагерь");
        }else {
            System.out.println("Я останусь дома");
        }
    }
}
