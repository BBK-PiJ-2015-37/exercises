public class ListIntSetScript {

	public static void main(String[] args) {
		ListIntSetScript listTest = new ListIntSetScript();
		listTest.launch();
	}
	
	public void launch(){
		ListIntSet list = new ListIntSet();
		list.add(6);
		list.add(11);
		//test that user cannot enter same integer twice
		list.add(11);
		list.add(4);
		list.add(7);
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(12);
		//test containVerbose(), expect true
		System.out.println(list.containsVerbose(5));
		//test containVerbose(), expect false
		System.out.println(list.containsVerbose(18));
		//test toString()
		System.out.println(list.toString());
	}
}