
import java.util.Scanner;

public class Ex6 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            //numbers recursively.

            System.out.print("Enter a natural number: ");
        int n1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter another natural number: ");
        int n2 = Integer.parseInt(input.nextLine());
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + findGCD(n1,n2) + ".");
    }

    private static boolean isFirstGreater(int n1, int n2) {
        boolean ans;
        if (n2 > n1) {
            return false;
        }
        return true;
    }

    private static int findGCD(int n1, int n2) {
        int temp;
        if (!isFirstGreater(n1, n2)) {
            temp = n2;
            n2 = n1;
            n1 = temp;
        }
        if (n1 % n2 == 0) {
            return n2;
        } else {
            return findGCD(n2, n1 % n2);
        }
    }
}