package day19;

/**
 * Use generics to replace betterString with betterEntry and TwoStringPredicate
 * with TwoElementPredicate. Make sure your previous examples still work when you
 * only change betterString to betterElement.
 */

public class Ex4 {

    public static void main(String[] args) {
        String string1 = "This is the first string";
        String string2 = "This is the second string";
        System.out.println(string1);
        System.out.println(string2);
        System.out.println("First test returns the longer string (should return s2):");
        System.out.println(StringUtils.betterElement(string1, string2, (s1, s2) -> s1.length() > s2.length()));
        System.out.println("Second test always returns the first string (should return s1):");
        System.out.println(StringUtils.betterElement(string1, string2, (s1, s2) -> true));
    }
}
