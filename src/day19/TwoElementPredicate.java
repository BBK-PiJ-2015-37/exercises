package day19;

/**
 * A functional interface created for Ex4
 */

@FunctionalInterface
public interface TwoElementPredicate<T> {

    /**
     * A method that takes two elements, compares them, and returns the 'better' one.
     *
     * @param e1 the first element to compare
     * @param e2 the second element to compare
     * @return true if e1 is the 'better' element (better is determined by the lambda
     * used), false otherwise
     */
    boolean isBetter(T e1, T e2);
}
