
import java.util.Scanner;

public class Ex2a { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            //one takes too long, try the other way.

            System.out.println(recFactorial(5));
        System.out.println(iterFactorial(5));
    }

    private static int recFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recFactorial(n-1);
        }
    }

    private static int iterFactorial(int n) {
        int ans = 1;
        while (n >= 1) {
            ans = ans * n;
            n--;
        }
        return ans;
    }
}