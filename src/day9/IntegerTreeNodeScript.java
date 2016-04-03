public class IntegerTreeNodeScript {

	public static void main(String[] args) {
		IntegerTreeNodeScript tree = new IntegerTreeNodeScript();
		tree.launch();
	}
	
	public void launch(){
		IntegerTree root = new IntegerTreeNode(6);
		root.add(9);
		root.add(5);
		root.add(3);
		root.add(8);
		root.add(11);
		root.add(12);
		System.out.println(root.contains(9));
		System.out.println(root.contains(8));
		System.out.println(root.contains(7));
		System.out.println("Maximum: " + root.getMax());
		System.out.println("Minimum: " + root.getMin());
		System.out.println(root.toString());
		System.out.println(root.toSimpleString());
		System.out.println(root.depth());
	}
}