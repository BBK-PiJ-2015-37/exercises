public class TreeIntSortedListScript {

	public static void main(String[] args) {
		TreeIntSortedListScript tree = new TreeIntSortedListScript();
		tree.launch();
	}
	
	public void launch(){
		IntSortedList root = new TreeIntSortedList(9);
		root.add(6);
		root.add(11);
		//test that user can enter same integer twice
		root.add(11);
		root.add(4);
		root.add(7);
		root.add(1);
		root.add(5);
		root.add(7);
		root.add(8);
		root.add(10);
		root.add(12);
		System.out.println(root.contains(9)); //should return true
		System.out.println(root.contains(1)); //should return true
		System.out.println(root.contains(12)); //should return true
		System.out.println(root.contains(15)); //should return false
		System.out.println(root.toString());
	}
}