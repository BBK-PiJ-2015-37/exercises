public class TreeIntSet implements IntSet {
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;
	
	public TreeIntSet(int newValue) {
		this.value = newValue;
		this.left = null;
		this.right = null;
	}
	
	/*
	 * Adds an integer to the set.
	 * Does nothing if integer already in set.
	 */
	public void add(int intToAdd) {
		if (contains(intToAdd) == true) {
			return;
		}
		if (intToAdd > this.value) {
			if (right == null) {
				right = new TreeIntSet(intToAdd);
				System.out.println(intToAdd + " added to tree.");				
			} else {
				right.add(intToAdd);
			}
		} else {
			if (left == null) {
				left = new TreeIntSet(intToAdd);
				System.out.println(intToAdd + " added to tree.");
			} else {
				left.add(intToAdd);
			}
		}
	}

	/*
	 * Returns true if integer already in set,
	 * false otherwise.
	 */
	public boolean contains(int intToFind) {
		if (intToFind == this.value) {
			return true;
		}
		if (intToFind > this.value) {
			if (right != null) {
				return right.contains(intToFind);
			}
		} else {
			if (left != null) {
				return left.contains(intToFind);
			}
		}
		return false;
	}

	/*
	 * Returns true if integer already in set,
	 * false otherwise. Prints elements as
	 * they are checked.
	 */
	public boolean containsVerbose(int intToFind){
		System.out.println("Checking next element... Value is " + this.value + ".");
		if (intToFind == this.value) {
			return true;
		}
		if (intToFind > this.value) {
			if (right != null) {
				return right.containsVerbose(intToFind);
			}
		} else {
			if (left != null) {
				return left.containsVerbose(intToFind);
			}
		}
		return false;		
	}

	/*
	 * Returns a string with values of the elements
	 * in the set separated by commas.
	 */
	public String toString() {
		String result = "";
		if ((this.left == null) & this.right == null) {
			result = this.value + result;
		} else {
			if (this.left == null) {
				result = result + this.value + "," + this.right.toString();
			} else if (this.right == null) {
				result = this.left.toString() + "," + this.value + result;
			} else {
				result = this.left.toString() + "," + this.value + "," + this.right.toString();
			}
		}
		return result;
	}
}