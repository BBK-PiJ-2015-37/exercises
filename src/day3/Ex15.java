
import java.util.Scanner;

public class Ex15 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //palindromes by definition.

        String text;
        String simplified = "";
        String reversed = "";
        int i;
        int j;
        System.out.print("Please enter some text: ");
        text = input.nextLine();
        for (i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                simplified = simplified + Character.toLowerCase(text.charAt(i));
            }
        }
        for (j = simplified.length()-1; j >= 0; j--) {
            reversed = reversed + simplified.charAt(j);
        }
        if (simplified.equals(reversed)) {
            System.out.println("Your text is a relaxed palindrome");
        } else {
            System.out.println("Your text is not a relaxed palindrome");
        }
    }
}