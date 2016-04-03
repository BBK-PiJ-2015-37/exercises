
import java.util.Scanner;

public class Ex11 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //for the same letter twice.

        String text;
        String srch;
        String used = " ";
        boolean repeated = false;
        int i;
        int j;
        int count;
        System.out.print("Please write a text: ");
        text = input.nextLine();
        while (!repeated) {
            System.out.print("Which letter would you like to count now? ");
            srch = input.nextLine();
            if (srch.length() != 1) {
                System.out.println("Please enter a single character.");
            } else {
                for (i = 0; i < used.length(); i++) {
                    if (srch.charAt(0) == used.charAt(i)) {
                        System.out.println("Repeated character. Exiting the program...");
                        repeated = true;
                        break;
                    }
                }
                used = used + srch;
                count = 0;
                for (j = 0; j < text.length(); j++) {
                    if (srch.charAt(0) == text.charAt(j)) {
                        count++;
                    }
                }
                if (!repeated) {
                    System.out.println("There are " + count + " in your text.");
                }
            }
        }
        System.out.println("Thank you for your cooperation. Good bye!");
    }
}