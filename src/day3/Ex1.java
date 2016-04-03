
import java.util.Scanner;

public class Ex1 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //why do they have these values?). If the program is not behaving correctly, fix it.

        double d1 = 1.255;
        double d2 = d1 + 7 - 4 - 3;
        if (Math.abs(d1 - d2) < 10E-6) {
            System.out.println("1.255 is equal to 1.255 plus 7 minus 7");
        } else {
            System.out.println("1.255 is NOT equal to 1.255 plus 7 minus 7");
        }
    }
}