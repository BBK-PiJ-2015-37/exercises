
import java.util.Scanner;

public class Ex13 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //a strict palindrome.

        String str, revStr = "";
        System.out.print("Please enter some text: ");
        str = input.nextLine();
        for (int i = str.length()-1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
        if (str.equals(revStr)) {
            System.out.println("Your text is a strict palindrome");
        } else {
            System.out.println("Your text is not a strict palindrome");
        }
    }
}