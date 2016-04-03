public interface IntegerTree {
	
	/*
	 * Adds an element to the tree.
	 */
	void add(int number);

	/*
	 * Searches for an integer in the tree.
	 * Returns true if integer found, false otherwise.
	 */	
	boolean contains(int number);
	
	/*
	 * Returns value of highest element in the tree.
	 */
	int getMax();
	
	/*
	 * Returns value of lowest element in the tree.
	 */
	int getMin();
	
	/*
	 * Returns representation of tree in string form.
	 * Each node is represented as a list containing
	 * its value and its left and right branches.
	 */
	String toString();
	
	/*
	 * Returns representation of tree in string form.
	 * Each node is represented as a list containing
	 * its value and its left and right branches,
	 * if these are not empty.
	 */
	String toSimpleString();
	
	/*
	 * Returns number of levels in the tree.
	 */
	int depth();

	/*
	 * Removes an element from the tree.
	 */	
	void remove(int number);
}