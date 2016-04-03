
import java.util.Scanner;

public class Ex8a { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //the same text on screen, but each letter on a different line.

        int k;
        System.out.print("Please enter some text (enclosed in \" \"): ");
        String str = input.nextLine();
        System.out.println("");
        for (k = 0; k < str.length(); k++) {
            System.out.println(str.charAt(k));
        }
    }
}