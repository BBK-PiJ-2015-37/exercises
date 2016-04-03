
import java.util.Scanner;

public class Ex2 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //method to parse real numbers.

        double d1, d2;
        int operation;
        boolean valid = false;
        System.out.print("Enter first number: ");
        d1 = Double.parseDouble(System.console().readLine());
        System.out.print("Enter second number: ");
        d2 = Double.parseDouble(System.console().readLine());
        while (!valid) {
            System.out.println("What would you like to do? Enter a number from the list below:");
            System.out.println("    1 -- Addition");
            System.out.println("    2 -- Subtraction");
            System.out.println("    3 -- Multiplication");
            System.out.println("    4 -- Division");
            System.out.print(">>> ");
            operation = Integer.parseInt(System.console().readLine());
            switch (operation) {
                case 1:    System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
                    valid = true;
                    break;
                case 2:    System.out.println(d1 + " - " + d2 + " = " + (d1 - d2));
                    valid = true;
                    break;
                case 3:    System.out.println(d1 + " x " + d2 + " = " + (d1 * d2));
                    valid = true;
                    break;
                case 4:    System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
                    valid = true;
                    break;
                default:   System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}