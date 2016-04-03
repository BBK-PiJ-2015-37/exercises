
import java.util.Scanner;

public class Ex3 { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //enters \u201c23 * 4\u201d the program outputs \u201c92\u201d.

        String operation;
        String operand = "";
        String n1 = "";
        String n2 = "";
        boolean operandSet = false;
        int i;
        System.out.print("Please enter a mathematical operation (+, -, * or /): ");
        operation = input.nextLine();
        for (i = 0; i < operation.length(); i++) {
            if (operation.charAt(i) == ' ') {
		continue;
            } else {
                if (operation.charAt(i) == '+') {
                    operand = operand + "+";
                    operandSet = true;
                } else {
                    if (operation.charAt(i) == '-') {
                        operand = operand + "-";
                        operandSet = true;
                    } else {
                        if (operation.charAt(i) == '*') {
                            operand = operand + "*";
                            operandSet = true;
                        } else {
                            if (operation.charAt(i) == '/') {
                                operand = operand + "/";
                                operandSet = true;
                            } else {
                                if (operandSet == false) {
                                    n1 = n1 + operation.charAt(i);
                                } else {
                                    if (operandSet == true) {
                                        n2 = n2 + operation.charAt(i);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (operand.equals("+")) {
            System.out.println(Double.parseDouble(n1) + Double.parseDouble(n2));
        } else {
            if (operand.equals("-")) {
                System.out.println(Double.parseDouble(n1) - Double.parseDouble(n2));
            } else {
                if (operand.equals("/")) {
                    System.out.println(Double.parseDouble(n1) / Double.parseDouble(n2));
                } else {
                    if (operand.equals("*")) {
                        System.out.println(Double.parseDouble(n1) * Double.parseDouble(n2));
                    }
                }
            }
        }
    }
}