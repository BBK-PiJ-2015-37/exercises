
import java.util.Scanner;

public class Ex10 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //You cannot use any method of String apart from charAt() and length().

        String srch;
        String text;
        int i;
        int j;
        int count = 0;
        boolean found = true;
        System.out.print("Enter a search term: ");
        srch = input.nextLine();
        System.out.print("Enter text to search: ");
        text = input.nextLine();
        for (i = 0; i <= text.length() - srch.length(); i++){
            for (j = 0; j <= srch.length()-1; j++) {
                found = true;
                if (srch.charAt(j) == text.charAt(i+j)) {
			continue;
                } else {
                    found = false;
                    break;
                }
            }
            if (found) {
                count++;
            }
        }
        System.out.println("Number of times search term found in text: " + count);
    }
}