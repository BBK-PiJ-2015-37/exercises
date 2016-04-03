
import java.util.Scanner;

public class Ex7 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //point is inside both rectangles, inside one of them only, or out of both.

        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();
        Point p5 = new Point();
        boolean validp2x = false;
        boolean validp2y = false;
        boolean validp4x = false;
        boolean validp4y = false;
        boolean inside1 = true;
        boolean inside2 = true;
        System.out.print("Enter the x-coordinate of the first rectangle's Upper Left point: ");
        p1.x = input.nextDouble();
        System.out.print("Enter the y-coordinate of the first rectangle's Upper Left point: ");
        p1.y = input.nextDouble();
        while (!validp2x) {
            System.out.print("Enter the x-coordinate of the first rectangle's Lower Right point: ");
            p2.x = input.nextDouble();
            if (p2.x <= p1.x) {
                System.out.println("The Lower Right point must be to the right of the Upper Left point.");
            } else {
                validp2x = true;
            }
        }
        while (!validp2y) {
            System.out.print("Enter the y-coordinate of the first rectangle's Lower Right point: ");
            p2.y = input.nextDouble();
            if (p2.y >= p1.y) {
                System.out.println("The Lower Right point must be below the Upper Left point.");
            } else {
                validp2y = true;
            }
        }
        System.out.println("");
        System.out.print("Enter the x-coordinate of the second rectangle's Upper Left point: ");
        p3.x = input.nextDouble();
        System.out.print("Enter the y-coordinate of the second rectangle's Upper Left point: ");
        p3.y = input.nextDouble();
        while (!validp4x) {
            System.out.print("Enter the x-coordinate of the second rectangle's Lower Right point: ");
            p4.x = input.nextDouble();
            if (p4.x <= p3.x) {
                System.out.println("The Lower Right point must be to the right of the Upper Left point.");
            } else {
                validp4x = true;
            }
        }
        while (!validp4y) {
            System.out.print("Enter the y-coordinate of the second rectangle's Lower Right point: ");
            p4.y = input.nextDouble();
            if (p4.y >= p3.y) {
                System.out.println("The Lower Right point must be below the Upper Left point.");
            } else {
                validp4y = true;
            }
        }
        System.out.println("");
        Rectangle rect1 = new Rectangle();
        rect1.upLeft = p1;
        rect1.downRight = p2;
        Rectangle rect2 = new Rectangle();
        rect2.upLeft = p3;
        rect2.downRight = p4;
        System.out.print("Enter the x-coordinate of a fifth point: ");
        p5.x = input.nextDouble();
        System.out.print("Enter the y-coordinate of a fifth point: ");
        p5.y = input.nextDouble();
        if ((rect1.upLeft.x > p5.x) || (p5.x > rect1.downRight.x)) {
            inside1 = false;
        } else {
            if ((rect1.upLeft.y < p5.y) || (p5.y < rect1.downRight.y)) {
                inside1 = false;
            }
        }
        if ((rect2.upLeft.x > p5.x) || (p5.x > rect2.downRight.x)) {
            inside2 = false;
        } else {
            if ((rect2.upLeft.y < p5.y) || (p5.y < rect2.downRight.y)) {
                inside2 = false;
            }
        }
        if ((inside1) && (inside2)) {
            System.out.println("The fifth point is inside both rectangles.");
        } else {
            if ((inside1) && (!inside2)){
                System.out.println("The fifth point is inside the first rectangle only.");
            } else {
                if ((!inside1) && (inside2)){
                    System.out.println("The fifth point is inside the second rectangle only.");
                } else {
                    System.out.println("The fifth point is outside both rectangles.");
                }
            }
        }
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