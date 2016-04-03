public class TreeIntSortedList implements IntSortedList {
	private int value;
	private TreeIntSortedList left;
	private TreeIntSortedList right;
	
	public TreeIntSortedList(int newValue) {
		this.value = newValue;
	}

	/*
	 * adds a new integer to the list so that the list
	 * remains sorted; a list can contain duplicates.
	 */
	public void add(int intToAdd) {
		if (this.value >= intToAdd) {
			if (this.left == null) {
				this.left = new TreeIntSortedList(intToAdd);
				System.out.println(intToAdd + " added to tree.");
			} else {
				this.left.add(intToAdd);
			}
		} else {
			if (this.right == null) {
				this.right = new TreeIntSortedList(intToAdd);
				System.out.println(intToAdd + " added to tree.");
			} else {
				this.right.add(intToAdd);
			}
		}
	}

	/*
	 * Returns true if the number is in the list,
	 * false otherwise.
	 */
	public boolean contains(int intToFind) {
		if (this.value == intToFind) {
			return true;
		}
		if (this.value > intToFind) {
			if (this.left != null) {
				return this.left.contains(intToFind);
			}		
		} else {
			if (this.right != null) {
				return this.right.contains(intToFind);
			}
		}
		return false;
	}

	/*
	 * Returns a string with the values of the elements
	 * in the list separated by commas.
	 */
	public String toString() {
		String result = "";
		if ((this.left == null) && (this.right == null)) {
			result = this.value + result;
		} else if (this.right == null) {
			result = this.left.toString() + "," + this.value + result;
		} else if (this.left == null) {
			result = result + this.value + "," + this.right.toString();
		} else {
			result = this.left.toString() + "," + this.value + "," + this.right.toString();
		}
		return result;
	}
}