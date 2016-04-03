public class TreeIntSetScript {

	public static void main(String[] args) {
		TreeIntSetScript tree = new TreeIntSetScript();
		tree.launch();
	}
	
	public void launch(){
		IntSet root = new TreeIntSet(9);
		root.add(6);
		root.add(11);
		//test that user cannot enter same integer twice
		root.add(11);
		root.add(4);
		root.add(7);
		root.add(1);
		root.add(5);
		root.add(7);
		root.add(8);
		root.add(10);
		root.add(12);
		//test containVerbose(), expect true
		System.out.println(root.containsVerbose(5));
		//test containVerbose(), expect false
		System.out.println(root.containsVerbose(18));
		//test toString()
		System.out.println(root.toString());
	}
}