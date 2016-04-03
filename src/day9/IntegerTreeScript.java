public class IntegerTreeScript {

	public static void main(String[] args) {
		IntegerTreeScript test = new IntegerTreeScript();
		test.launch();
	}

	public void launch() {
		IntegerTree tree = new IntegerTreeRoot();
		tree.add(6);
		tree.add(9);
		tree.add(5);
		tree.add(3);
		tree.add(8);
		tree.add(11);
		tree.add(12);
		System.out.println(tree.contains(9));
		System.out.println(tree.contains(8));
		System.out.println(tree.contains(7));
		System.out.println("Maximum: " + tree.getMax());
		System.out.println("Minimum: " + tree.getMin());
		System.out.println(tree.toString());
		System.out.println(tree.toSimpleString());
		System.out.println(tree.depth());
	}
}