package day19;

/**
 * Create an array containing some Strings. Sort the array by:
 * • length (i.e., shortest to longest)
 * • reverse length (i.e., longest to shortest)
 * • first character
 * • Strings that contain “e” first, everything else second.
 */

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        String[] strArray = {"two", "four", "seven", "eighty", "nineteen"};
        System.out.println("Original array: " + Arrays.asList(strArray));
        Arrays.sort(strArray, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted by length (shortest to longest): " + Arrays.asList(strArray));
        Arrays.sort(strArray, (s1, s2) -> s2.length() - s1.length());
        System.out.println("Sorted by length (longest to shortest): " + Arrays.asList(strArray));
        Arrays.sort(strArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.println("Sorted by first character: " + Arrays.asList(strArray));
        Arrays.sort(strArray, (s1, s2) -> {
            if (s1.contains("e") && !s2.contains("e")) {
                return -1;
            } else if (!s1.contains("e") && s2.contains("e")) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println("Sorted by presence of 'e': " + Arrays.asList(strArray));
    }
}
