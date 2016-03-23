package day19;

/**
 * A functional interface created for Ex3
 */
public interface TwoStringPredicate {

    /**
     * A method that takes two strings, compares them, and returns the 'better' one.
     *
     * @param s1 the first String object to compare
     * @param s2 the second String object to compare
     * @return the 'better' string (better is determined by the lambda used)
     */
    boolean isBetter(String s1, String s2);
}
