package day19;

/**
 * Class created to contact static method required for Ex2 and Ex3.
 */
public class StringUtils {

    /**
     * A method that compares two strings and orders them based on whether
     * or not they contain the character 'e'.
     *
     * @param s1 the first String object to compare
     * @param s2 the second String object to compare
     * @return -1 if the first string contains an e and the second doesn't,
     * 1 if the first string doesn't contain an e and the second does,
     * or 0 if both or neither of them contain an e
     */
    public static int eChecker(String s1, String s2) {
        if (s1.contains("e") && !s2.contains("e")) {
            return -1;
        } else if (!s1.contains("e") && s2.contains("e")) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * A method that compares two strings and returns the 'better' string, better
     * being defined by the test entered as a parameter.
     *
     * @param s1 the first String object to compare
     * @param s2 the second String object to compare
     * @param test the test condition that determines what 'better' means
     * @return the 'better' string
     */
    public static String betterString(String s1, String s2, TwoStringPredicate test) {
        if (test.isBetter(s1, s2)) {
            return s1;
        } else return s2;
    }

    /**
     * A method that compares two elements and returns the 'better' element, better
     * being defined by the test entered as a parameter.
     *
     * @param e1 the first element to compare
     * @param e2 the second element to compare
     * @param test the test condition that determines what 'better' means
     * @return the 'better' element
     */
    public static <T> T betterElement(T e1, T e2, TwoElementPredicate<T> test) {
        if (test.isBetter(e1, e2)) {
            return e1;
        } else return e2;
    }
}
