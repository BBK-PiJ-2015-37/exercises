
import java.util.Scanner;

public class Ex5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //calculate (and write on the screen) the perimeter and area of the rectangle.

        Point p1 = new Point();
        Point p2 = new Point();
        double width, length, perimeter, area;
        System.out.print("Enter the x-coordinate of the Upper Left point: ");
        p1.x = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the y-coordinate of the Upper Left point: ");
        p1.y = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the x-coordinate of the Lower Right point: ");
        p2.x = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the y-coordinate of the Lower Right point: ");
        p2.y = Double.parseDouble(System.console().readLine());
        Rectangle rect = new Rectangle();
        rect.upLeft = p1;
        rect.downRight = p2;
        length = rect.downRight.x - rect.upLeft.x;
        width = rect.upLeft.y - rect.downRight.y;
        area = length * width;
        perimeter = (2 * length) + (2 * width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
    static class Rectangle {
        Point upLeft;
        Point downRight;
    }
    static class Point {
        double x;
        double y;
    }
}