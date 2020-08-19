package lesson20;

public class HW15 {

    public static void main(String[] args) {

        String str1 = "Василий";
        String str2 = "Василиса";

        // contains(CharSequence s)
        System.out.println("contains");
        System.out.println(str1.contains("R"));
        System.out.println(str1.contains("В"));
        System.out.println(str1.contains("Василий"));
        System.out.println(str1.contains(str2));

        split();
        //endsWith(String suffix)
        System.out.println("endsWith");
        System.out.println(str1.endsWith("ий"));
        System.out.println(str1.endsWith("илий"));
        System.out.println(str1.endsWith("Вас"));

        split();
        // equals(Object anObject)
        System.out.println("equals");
        System.out.println(str1.equals(str2));
        System.out.println("andrej".equals("андрей"));
        System.out.println("аба".equals("аба"));

        split();
        // equalsIgnoreCase(String anotherString)
        System.out.println("equalsIgnoreCase(String anotherString)");
        System.out.println(str1.equalsIgnoreCase("вАсИлИй"));

        split();
        // isEmpty()
        System.out.println("isEmpty()");
        System.out.println(str1.isEmpty());
        System.out.println("".isEmpty());

        split();
        // length()
        System.out.println("Андрей  Подлубный".length());

        split();
        // replace(char oldChar, char newChar)
        System.out.println("replace(char oldChar, char newChar)");
        System.out.println(str1.replace('и', 'I'));
        String myDate1 = "22.07.2020";
        String myDate2 = "22/07/2020";
        String myDate3 = "22-07-2020";

        split();
        System.out.println("startsWith(String prefix)");
        System.out.println(str1.startsWith("Вас"));

        split();
        System.out.println("substring(int beginIndex)");
        System.out.println(str1.substring(2, 5) + str2.substring(3));

        split();
        System.out.println("toLowerCase()");
        System.out.println("toUpperCase()");

        System.out.println(str1.toUpperCase() + str2.toUpperCase());
        System.out.println((str1 + str2).toLowerCase());

        split();
        System.out.println("trim()");
        System.out.println("      sjkhgfdslghfdsgk         ".trim());
        split();

        String str3 = "В а                                с и л и й";
        System.out.println(str3.replace(" ", ""));
    }

    public static void split() {
        System.out.println("----------------------------");
    }
}
