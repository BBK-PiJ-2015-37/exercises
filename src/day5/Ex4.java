
import java.util.Scanner;

public class W5Ex4 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            //true if the String is a palindrome and false otherwise.

            System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        str = simplifyString(str);
        if (str.length() < 2) {
            return true;
        } else {
            if (str.length() == 2) {
                if (str.charAt(0) == str.charAt(str.length()-1)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (str.charAt(0) != str.charAt(str.length()-1)) {
                    return false;
                } else {
                    return isPalindrome(str.substring(1,str.length()-1));
                }
            }
        }
    }

    private static String simplifyString(String str) {
        String simplified = "";
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                simplified = simplified + Character.toLowerCase(str.charAt(i));
            }
        }
        return simplified;
    }
}