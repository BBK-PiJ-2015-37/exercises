
import java.util.Scanner;

public class Ex5 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            //calculates the power. Is it easy to do this both iteratively and recursively?

            System.out.println(iterPow(2,3));
        System.out.println(iterPow(3,3));
        System.out.println(iterPow(4,3));
        System.out.println(recPow(2,3));
        System.out.println(recPow(3,3));
        System.out.println(recPow(4,3));
    }

    private static int iterPow(int base, int exponent) {
        int ans = 1;
        while (exponent > 0) {
            ans = ans * base;
            exponent--;
        }
        return ans;
    }

    private static int recPow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * recPow(base, exponent - 1);
        }
    }
}