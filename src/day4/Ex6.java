
import java.util.Scanner;

public class Ex6 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer2 i2 = new Integer2();
        System.out.print("Enter a number: ");
        String str = System.console().readLine();
        int i = Integer.parseInt(str);
        i2.setValue(i);
        System.out.print("The number you entered is ");
        if (i2.isEven()) {
            System.out.println("even.");
        } else if (i2.isOdd()) {
            System.out.println("odd.");
        } else {
            System.out.println("undefined!! Your code is buggy!");
        }
        int parsedInt = Integer.parseInt(i2.toString());
        if (parsedInt == i2.getValue()) {
            System.out.println("Your toString() method seems to work fine.");
        }
    }
    static class Integer2 {
        int value;
        int getValue() {
            return value;
        }
        void setValue(int x) {
            value = x;
        }
        boolean isEven() {
            if (value % 2 == 0) {
                return true;
            }
            return false;
        }
        boolean isOdd() {
            if (value % 2 == 1) {
                return true;
            }
            return false;
        }
        void prettyPrint() {
            System.out.println(value);
        }
        public String toString() {
            String s = String.valueOf(value);
            return s;
        }
    }
}