
import java.util.Scanner;

public class Ex8b { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //than letter on a different line.

        int k;
        char space = ' ';
        System.out.print("Please enter some text (enclosed in \" \"): ");
        String str = input.nextLine();
        System.out.println("");
        for (k = 0; k < str.length(); k++) {
            if ((str.charAt(k) == space)){
                System.out.println(str.charAt(k));
            } else {
                System.out.print(str.charAt(k));
            }
        }
    }
}