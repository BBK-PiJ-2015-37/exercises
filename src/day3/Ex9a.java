
import java.util.Scanner;

public class Ex9a { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //letters \u2019e\u2019 are there in that text.

        int k, count = 0;
        System.out.print("Please enter some text (enclosed in \" \"): ");
        String str = input.nextLine();
        for (k = 0; k < str.length(); k++) {
            if ((str.charAt(k) == 'e')){
                count++;
            }
        }
        System.out.println("The number of e's in your text is: " + count);
    }
}