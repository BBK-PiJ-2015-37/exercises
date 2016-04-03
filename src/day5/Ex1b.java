
import java.util.Scanner;

public class Ex1b { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(buggyMethod(6));
        System.out.println(buggyMethod(7));
    }

    private static String buggyMethod(int n) {
        if (n <= 0) {
            return "";
        }
        return n + " " + buggyMethod(n - 2);
    }
}