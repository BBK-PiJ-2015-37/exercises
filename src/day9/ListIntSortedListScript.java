public class ListIntSortedListScript {

	public static void main(String[] args) {
		ListIntSortedListScript listTest = new ListIntSortedListScript();
		listTest.launch();
	}
	
	public void launch(){
		IntSortedList list = new ListIntSortedList();
		list.add(6);
		list.add(11);
		//test that user can enter same integer twice
		list.add(11);
		list.add(4);
		list.add(7);
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(12);
		System.out.println(list.contains(1)); //should return true
		System.out.println(list.contains(7)); //should return true
		System.out.println(list.contains(12)); //should return true
		System.out.println(list.contains(15)); //should return false
		System.out.println(list.toString());
	}
}