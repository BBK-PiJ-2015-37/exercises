
import java.util.Scanner;

public class Ex14 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //a saw tI\u201d.

        String str, revStr = "";
        System.out.print("Please enter some text: ");
        str = input.nextLine();
        for (int i = str.length()-1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }
        System.out.println(str + revStr);
    }
}