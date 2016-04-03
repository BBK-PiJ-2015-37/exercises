
import java.util.Scanner;

public class Ex5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Point point1 = new Point();
        point1.x = 3;
        point1.y = 3;
        Point point2 = new Point();
        point2.x = 7;
        point2.y = 7;
        System.out.println(point1.distanceTo(point2));
        System.out.println(point1.distanceToOrigin());
        point1.moveTo(9,9);
        System.out.println(point1.x);
        System.out.println(point1.y);
        point1.moveTo(point2);
        System.out.println(point1.x);
        System.out.println(point1.y);
        Point clone = point1.clone();
        System.out.println(clone.x);
        System.out.println(clone.y);
        Point opposite = point1.opposite();
        System.out.println(opposite.x);
        System.out.println(opposite.y);
    }
    static class Point {
        double x;
        double y;
        double distanceTo(Point point) {
            double dist = Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
            return dist;
        }
        double distanceToOrigin() {
            Point origin = new Point();
            origin.x = 0;
            origin.y = 0;
            return distanceTo(origin);
        }
        void moveTo(double x, double y) {
            this.x = x;
            this.y = y;
            System.out.println("Point moved to " + x + "," + y + ".");
        }
        void moveTo(Point point) {
            this.x = point.x;
            this.y = point.y;
            System.out.println("Point moved to " + point.x + "," + point.y + ".");
        }
        public Point clone() {
            Point copy = new Point();
            copy.x = this.x;
            copy.y = this.y;
            System.out.println("Clone created.");
            return copy;
        }
        Point opposite() {
            Point opposite = new Point();
            opposite.x = -1 * this.x;
            opposite.y = -1 * this.y;
            System.out.println("Opposite created.");
            return opposite;
        }
    }
}