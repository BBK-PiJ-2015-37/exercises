
import java.util.Scanner;

public class Ex3 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        int choice;
        while (running) {
            System.out.println("What would you like to do?");
            System.out.println("    1 - Convert binary to decimal");
            System.out.println("    2 - Convert decimal to binary");
            System.out.println("    0 - Exit");
            System.out.print(">>> ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0:		System.out.println("Closing program...");
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                case 1:		System.out.print("Enter a binary number: ");
                    String bin = input.nextLine();
                    if (isValidBinary(bin)){
                        System.out.println("That's " + binary2decimal(bin) + " in decimal.");
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("That is not a binary number.");
                        System.out.println("");
                        break;
                    }
                case 2:		System.out.print("Enter a decimal number: ");
                    int dec = Integer.parseInt(input.nextLine());
                    System.out.println("That's " + decimal2binary(dec) + " in binary.");
                    System.out.println("");
                    break;
                default:	System.out.println("Invalid entry. Try again.");
                    System.out.println("");
                    break;
            }
        }
    }

    private static int power(int base, int exponent){
        int ans = 1;
        for (int i = exponent; i > 0; i--){
            ans = ans * base;
        }
        return ans;
    }

    private static int power2(int exponent) {
        return power(2, exponent);
    }

    private static boolean isValidBinary(String binary){
        String s;
        for (int i = 0; i < binary.length(); i++){
            s = "" + binary.charAt(i);
            if (!(s.equals("0")) && !(s.equals("1"))){
                return false;
            }
        }
        return true;
    }

    private static int binary2decimal(String binary){
        int currentPower = binary.length()-1;
        int ans = 0;
        int temp;
        String s;
        for (int i = 0; i < binary.length(); i++){
            s = "" + binary.charAt(i);
            temp = Integer.parseInt(s) * power2(currentPower);
            ans = ans + temp;
            currentPower--;
        }
        return ans;
    }

    private static String decimal2binary(int decimal){
        String reversed = "";
        String ans = "";
        String temp;
        int current = decimal;
        while (current != 0){
            temp = Integer.toString(current%2);
            reversed = reversed + temp;
            current = current/2;
        }
        for (int i = reversed.length()-1; i >= 0; i--) {
            ans = ans + reversed.charAt(i);
        }
        return ans;
    }
}