package lesson37;

public class Calendar {

    public static void main(String[] args) {

        createCalendar();

    }

    public static void createCalendar() {
        int[][] monthCalendar;
        monthCalendar = new int[4][7];
        //1,2,3,4,5,6,7
        //8,9,10,11,12,13,14
        //15,16,17,18,19,20,21
        //22,23,24,25,26,27,28

        for (int i = 0; i < monthCalendar.length; i++) {
            for (int j = 0; j < monthCalendar[i].length; j++) {
                monthCalendar[i][j] = i * 7 + j + 1;
                System.out.print(monthCalendar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Computer, распечатай мне элемент по индексу [1][3] - " + monthCalendar[1][3]);
    }
}