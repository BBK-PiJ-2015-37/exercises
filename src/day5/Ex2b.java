
import java.util.Scanner;

public class Ex2b { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            //time that is needed in each case to find F(40) or F(45).

            System.out.println(recFibonacci(8));
        System.out.println(iterFibonacci(8));
    }

    private static int recFibonacci(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return (recFibonacci(n-1) + recFibonacci(n-2));
        }
    }

    private static int iterFibonacci(int n) {
        int ans = 0;
        int temp1 = 1;
        int temp2 = 1;
        int i = 3;
        while (i <= n) {
            ans = temp1 + temp2;
            i++;
            temp1 = temp2;
            temp2 = ans;
        }
        return ans;
    }
}