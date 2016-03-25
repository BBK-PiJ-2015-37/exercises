package day19;

/**
 * A functional interface created for Ex3
 */

@FunctionalInterface
public interface TwoStringPredicate {

    /**
     * A method that takes two strings, compares them, and returns the 'better' one.
     *
     * @param s1 the first String object to compare
     * @param s2 the second String object to compare
     * @return true if s1 is the 'better' string (better is determined by the lambda
     * used), false otherwise
     */
    boolean isBetter(String s1, String s2);
}
