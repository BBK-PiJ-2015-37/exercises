package day19;

/**
 * For the last sorting example in Ex1 (strings with "e" first), move the logic that computes
 * the number to a separate static method. Now, rewrite the final lambda sorting example, but
 * use a method reference in place of an explicit lambda.
 */

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
        String[] strArray = {"two", "four", "seven", "eighty", "nineteen"};
        System.out.println("Original array: " + Arrays.asList(strArray));
        Arrays.sort(strArray, StringUtils::eChecker);
        System.out.println("Sorted by presence of 'e': " + Arrays.asList(strArray));
    }
}
