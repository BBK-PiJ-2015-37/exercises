package day19;

/**
 * Create a class with a static method called betterString. This method should
 * take two Strings and a lambda as its arguments. This lambda states whether the
 * first of the two strings is better.
 *
 * The method should return the better string; i.e., if the lambda returns true the
 * method should return the first string, otherwise it should return the second string.
 *
 * For the lambda, define an interface called TwoStringPredicate with a method that
 * takes two Strings and returns true if the first is better than the second, false
 * otherwise.
 */

public class Ex3 {

    public static void main(String[] args) {
        String string1 = "This is the first string";
        String string2 = "This is the second string";
        System.out.println(string1);
        System.out.println(string2);
        System.out.println("First test returns the longer string (should return s2):");
        System.out.println(StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length()));
        System.out.println("Second test always returns the first string (should return s1):");
        System.out.println(StringUtils.betterString(string1, string2, (s1, s2) -> true));
    }
}
