public class IntegerTreeNode implements IntegerTree {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int newValue) {
		this.value = newValue;
		this.left = null;
		this.right = null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int newValue) {
		this.value = newValue;
	}
	
	public IntegerTreeNode getLeft() {
		return this.left;
	}

	public IntegerTreeNode getRight() {
		return this.right;
	}

	public void setLeft(IntegerTreeNode newLeft) {
		this.left = newLeft;
	}

	public void setRight(IntegerTreeNode newRight) {
		this.right = newRight;
	}
	
	/*
	 * Adds an element to the tree.
	 */
	public void add(int number) {
		if (number > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(number);
				System.out.println(number + " added to tree.");				
			} else {
				right.add(number);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(number);
				System.out.println(number + " added to tree.");
			} else {
				left.add(number);
			}
		}
	}

	/*
	 * Searches for an integer in the tree.
	 * Returns true if integer found, false otherwise.
	 */	
	public boolean contains(int number) {
		if (number == this.value) {
			return true;
		}
		if (number > this.value) {
			if (right != null) {
				return right.contains(number);
			}
		} else {
			if (left != null) {
				return left.contains(number);
			}
		}
		return false;
	}
	
	/*
	 * Returns value of highest element in the tree.
	 */
	public int getMax() {
		if (right == null) {
			return this.value;
		} else {
			return right.getMax();
		}
	}
	
	/*
	 * Returns value of lowest element in the tree.
	 */
	public int getMin() {
		if (left == null) {
			return this.value;
		} else {
			return left.getMin();
		}
	}

	/*
	 * Returns representation of tree in string form.
	 * Each node is represented as a list containing
	 * its value and its left and right branches.
	 */
	public String toString() {
		int NodeValue = this.value;
		String leftNode;
		String rightNode;
		if (left == null) {
			leftNode = "[]";
		} else {
			leftNode = left.toString();
		}
		if (right == null) {
			rightNode = "[]";
		} else {
			rightNode = right.toString();
		}
		String result = "[" + NodeValue + " L" + leftNode + " R" + rightNode + "]";
		return result;
	}
	
	/*
	 * Returns representation of tree in string form.
	 * Each node is represented as a list containing
	 * its value and its left and right branches,
	 * if these are not empty.
	 */
	public String toSimpleString() {
		int NodeValue = this.value;
		String leftNode;
		String rightNode;
		String result; 
		if (left == null) {
			leftNode = "";
		} else {
			leftNode = left.toSimpleString();
		}
		if (right == null) {
			rightNode = "";
		} else {
			rightNode = right.toSimpleString();
		}
		if (leftNode.equals("")) {
			if (rightNode.equals("")) {
				result = "[" + NodeValue + "]";
			} else {
				result = "[" + NodeValue + " " + rightNode + "]";
			}
		} else {
			if (rightNode.equals("")) {
				result = "[" + NodeValue + " " + leftNode + "]";
			} else {
				result = "[" + NodeValue + " " + leftNode + " " + rightNode + "]";
			}	
		}
		return result;		
	}

	/*
	 * Returns number of levels in the tree.
	 */
	public int depth() {
		int leftDepth = 0;
		if(this.left != null) {
			leftDepth = this.left.depth();
		}
		int rightDepth = 0;
		if(this.right != null) {
			rightDepth = this.right.depth();
			}
		if (rightDepth > leftDepth) {
			return rightDepth + 1;
		} else {
			return leftDepth + 1;
		}
	}

	/*
	 * Removes an element from the tree.
	 */	
	public void remove(int intToRemove) {
		if (!(contains(intToRemove))) {
			System.out.println("Element not in tree.");
		} else if (intToRemove < this.value) {
			return this.left.remove(intToRemove);
		} else if (intToRemove > this.value) {
			return this.right.remove(intToRemove);
		} else {
			
		}
	}


}