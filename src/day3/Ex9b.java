
import java.util.Scanner;

public class Ex9b { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //the letter in the text.

        int k, count = 0;
        String test;
        System.out.print("Please enter some text: ");
        String str = input.nextLine();
        System.out.print("Please enter a letter to test for: ");
        test = input.nextLine();
        for (k = 0; k < str.length(); k++){
            if ((str.charAt(k) == test.charAt(0))){
                count++;
            }
        }
        System.out.println("The number of " + test + "'s in your text is: " + count);
    }
}