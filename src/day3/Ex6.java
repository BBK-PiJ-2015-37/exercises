
import java.util.Scanner;

public class Ex6 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //then determine whether the point falls inside or outside the rectangle.

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        boolean validp2x = false;
        boolean validp2y = false;
        String p3position = null;
        System.out.print("Enter the x-coordinate of the Upper Left point: ");
        p1.x = input.nextDouble();
        System.out.print("Enter the y-coordinate of the Upper Left point: ");
        p1.y = input.nextDouble();
        while (!validp2x) {
            System.out.print("Enter the x-coordinate of the Lower Right point: ");
            p2.x = input.nextDouble();
            if (p2.x <= p1.x) {
                System.out.println("The Lower Right point must be to the right of the Upper Left point.");
            } else {
                validp2x = true;
            }
        }
        while (!validp2y) {
            System.out.print("Enter the y-coordinate of the Lower Right point: ");
            p2.y = input.nextDouble();
            if (p2.y >= p1.y) {
                System.out.println("The Lower Right point must be below the Upper Left point.");
            } else {
                validp2y = true;
            }
        }
        Rectangle rect = new Rectangle();
        rect.upLeft = p1;
        rect.downRight = p2;
        System.out.print("Enter the x-coordinate of a third point: ");
        p3.x = input.nextDouble();
        System.out.print("Enter the y-coordinate of a third point: ");
        p3.y = input.nextDouble();
        if ((rect.upLeft.x > p3.x) || (p3.x > rect.downRight.x)) {
            p3position = "outside";
        } else {
            if ((rect.upLeft.y < p3.y) || (p3.y < rect.downRight.y)) {
                p3position = "outside";
            } else {
                p3position = "inside";
            }
        }
        System.out.println("The third point is " + p3position + " the rectangle.");
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