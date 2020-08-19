package homeworks;

public class Homework02 {

    public static void main(String[] args) {

        areaAndPerimeterOfSquare();
        System.out.println("-------------------------------------------");
        areaAndPerimeterOfRectangle();
        System.out.println("-------------------------------------------");
        areaAndPerimeterOfCube();
    }

    public static void areaAndPerimeterOfSquare() {

        byte side = 7;
        byte area = (byte) (side * side);
        byte perimeter = (byte) (4 * side);
        System.out.println("Area of Square is: " + area);
        System.out.println("Perimeter of Square is: " + perimeter);
    }

    public static void areaAndPerimeterOfRectangle(){
        short length = 10;
        short breadth = 7;
        short area = (short) (length * breadth);
        short perimeter = (short) (2 * (length + breadth));
        System.out.println("Area of Rectangle is: " + area);
        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }

    public static void areaAndPerimeterOfCube(){
        int side = 15;
        int area = 6 * side * side;
        int perimeter = 12 * side;
        System.out.println("Area of Cube is: " + area);
        System.out.println("Perimeter of Cube is: " + perimeter);
    }

    public static void theNumberOfGrainsOnAChessboard(){
    }

}
