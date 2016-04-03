
import java.util.Scanner;

public class Ex4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //outputs which of the three are closer.

        Point point1 = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        Double dist12, dist13, dist23, smallest;
        System.out.print("Enter the x-coordinate of Point 1: ");
        point1.x = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the y-coordinate of Point 1: ");
        point1.y = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the x-coordinate of Point 2: ");
        point2.x = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the y-coordinate of Point 2: ");
        point2.y = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the x-coordinate of Point 3: ");
        point3.x = Double.parseDouble(System.console().readLine());
        System.out.print("Enter the y-coordinate of Point 3: ");
        point3.y = Double.parseDouble(System.console().readLine());
        dist12 = Math.sqrt(Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2));
        dist13 = Math.sqrt(Math.pow((point1.x - point3.x), 2) + Math.pow((point1.y - point3.y), 2));
        dist23 = Math.sqrt(Math.pow((point2.x - point3.x), 2) + Math.pow((point2.y - point3.y), 2));
        smallest = Math.min(dist12, Math.min(dist13, dist23));
        if ((Math.abs(smallest - dist12) < 10E-6) && (Math.abs(smallest - dist13) < 10E-6) && (Math.abs(smallest - dist23) < 10E-6)) {
            System.out.println("All three points are equidistant");
        } else {
            if ((Math.abs(smallest - dist12) < 10E-6) && (Math.abs(smallest - dist13) < 10E-6)) {
                System.out.println("Points 1 and 2 and Points 1 and 3 are closest");
            } else {
                if ((Math.abs(smallest - dist12) < 10E-6) && (Math.abs(smallest - dist23) < 10E-6)) {
                    System.out.println("Points 1 and 2 and Points 2 and 3 are closest");
                } else {
                    if ((Math.abs(smallest - dist13) < 10E-6) && (Math.abs(smallest - dist23) < 10E-6)) {
                        System.out.println("Points 1 and 3 and Points 2 and 3 are closest");
                    } else {
                        if (Math.abs(smallest - dist12) < 10E-6) {
                            System.out.println("Points 1 and 2 are closest");
                        } else {
                            if (Math.abs(smallest - dist13) < 10E-6) {
                                System.out.println("Points 1 and 3 are closest");
                            } else {
                                if (Math.abs(smallest - dist23) < 10E-6) {
                                    System.out.println("Points 2 and 3 are closest");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    static class Point {
        double x;
        double y;
    }
}