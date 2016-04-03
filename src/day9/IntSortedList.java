public interface IntSortedList {

	/*
	 * Adds a new integer to the list so that the list
	 * remains sorted; a list can contain duplicates.
	 */
	void add(int number);
	
	/*
	 * Returns true if the number is in the list,
	 * false otherwise.
	 */
	boolean contains(int number);
	
	/*
	 * Returns a string with the values of the elements
	 * in the list separated by commas.
	 */
	String toString();
}