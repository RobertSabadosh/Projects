package lesson39;

public class IPlusPlusI {
    public static void main(String[] args) {
        basic();
        iPlus();
        plusI();
    }

    private static void basic() {
        int i = 1;
        int j = 1;
        System.out.print(i++);
        System.out.print("    ");
        System.out.print(++j);
        System.out.println();
        System.out.print(i);
        System.out.print("    ");
        System.out.print(j);
        System.out.println();
    }

    public static void iPlus() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(count);
    }

    public static void plusI() {
        int count = 0;
        for (int i = 0; i < 10; ++i) {
            count++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(count);
    }
}
/*++ i (операция с префиксом): увеличивает, а затем присваивает значение
(например): int i = 5, int b = ++ i.
В этом случае сначала назначается 6 для b, а затем увеличивается до 7 и так далее.
i ++ (операция Postfix): присваивает, а затем увеличивает значение
(например,): int i = 5, int b = i ++.
В этом случае 5 присваивается сначала b, а затем увеличивается до 6 и т. д.
Использование цикла for: i ++ используется главным образом потому,
что обычно мы используем начальное значение i, прежде чем увеличивать значение цикла loop.
 Но в зависимости от логики вашей программы оно может изменяться.
 */
