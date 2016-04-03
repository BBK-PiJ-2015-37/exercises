public interface IntSet {

	/*
	 * Adds an integer to the set.
	 * Does nothing if integer already in set.
	 */
	void add(int number);

	/*
	 * Returns true if integer already in set,
	 * false otherwise.
	 */
	boolean contains(int number);

	/*
	 * Returns true if integer already in set,
	 * false otherwise. Prints elements as
	 * they are checked.
	 */
	boolean containsVerbose(int number);
	
	/*
	 * Returns a string with values of the elements
	 * in the set separated by commas.
	 */
	String toString();
}