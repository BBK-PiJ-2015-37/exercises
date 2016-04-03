public class IntegerTreeRoot implements IntegerTree {
	private IntegerTreeNode root;
	
	public IntegerTreeRoot() {
		root = null;
	}

	/*
	 * Adds an element to the tree.
	 */
	public void add(int intToAdd) {
		if (root == null) {
			root = new IntegerTreeNode(intToAdd);
			System.out.println(intToAdd + " added to tree as root.");
		} else {
			root.add(intToAdd);
		}
	}

	/*
	 * Searches for an integer in the tree.
	 * Returns true if integer found, false otherwise.
	 */	
	public boolean contains(int intToFind) {
		if (root == null) {
			System.out.println("Tree empty.");
			return false;
		} else {
			return root.contains(intToFind);
		}
	}
	
	/*
	 * Returns value of highest element in the tree.
	 */
	public int getMax() {
		return root.getMax();
	}
	
	/*
	 * Returns value of lowest element in the tree.
	 */
	public int getMin() {
		return root.getMin();
	}
	
	/*
	 * Returns representation of tree in string form.
	 * Each node is represented as a list containing
	 * its value and its left and right branches.
	 */
	public String toString() {
		return root.toString();
	}
	
	/*
	 * Returns representation of tree in string form.
	 * Each node is represented as a list containing
	 * its value and its left and right branches,
	 * if these are not empty.
	 */
	public String toSimpleString() {
		return root.toSimpleString();
	}
	
	/*
	 * Returns number of levels in the tree.
	 */
	public int depth() {
		if (root == null) {
			return 0;
		} else {
			return root.depth();
		}
	}

	/*
	 * Removes an element from the tree.
	 */	
	public void remove(int intToRemove) {
		if (root == null) {
			System.out.println("Tree empty.");
		} else {
			return root.remove(intToRemove);
		}
	}
}