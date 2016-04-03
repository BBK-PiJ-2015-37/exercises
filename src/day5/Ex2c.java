
import java.util.Scanner;

public class Ex2c { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            //For n disks, number of moves required is 2 to the power of n, minus one

            System.out.println(solveHanoi(1));
        System.out.println(solveHanoi(2));
        System.out.println(solveHanoi(3));
        System.out.println(solveHanoi(4));
        System.out.println(solveHanoi(5));
        System.out.println(solveHanoi(6));
        System.out.println(solveHanoi(7));
        System.out.println(solveHanoi(8));
        System.out.println(solveHanoi(9));
        System.out.println(solveHanoi(10));
        System.out.println(solveHanoi(20));
    }

    private static int solveHanoi(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 1 + (2*(solveHanoi(n-1)));
        }
    }
}