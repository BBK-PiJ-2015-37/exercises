public class ListUtilities {

	public static IntegerList convertToList(int[] intArray) {
		IntegerList list = new IntegerList();
		for (int i = 0; i < intArray.length; i++) {
			IntegerNode next = new IntegerNode(intArray[i]);
			list.addToList(next);
		}
		return list;
	}
	
	public static IntegerList convertToSortedList(int[] intArray) {
		IntegerList list = new IntegerList();
		for (int i = 0; i < intArray.length; i++) {
			IntegerNode next = new IntegerNode(intArray[i]);
			list.addToSortedList(next);
		}
		return list;
	}
	
	public static IntegerList bubbleSort(IntegerList list) {
		IntegerNode temp = new IntegerNode(0);
		boolean finished = false;
		boolean swapped;
		IntegerNode current;
		while (!finished) {
			current = list.getHead();
			swapped = false;
			if (current.getNumber() > current.getNext().getNumber()) {
				temp = current.getNext();
				current.setNext(current.getNext().getNext());
				temp.setNext(current);
				list.setHead(temp);
			}
			current = list.getHead();
			while (current.getNext().getNext() != null) {
				if (current.getNext().getNumber() > current.getNext().getNext().getNumber()) {
					temp = current.getNext().getNext();
					current.getNext().setNext(temp.getNext());
					temp.setNext(current.getNext());
					current.setNext(temp);
					swapped = true;
				}
				current = current.getNext();
			}
			if (!swapped) {
				finished = true;
			}
		}
		return list;
	}
	
	public void launch() {
		int[] intArray = {5,9,12,1,18,3,16,20,2,7,10,19,14,15,5,11,6,13,17,8};
		int[] intArray2 = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		IntegerList list1 = convertToList(intArray);
		IntegerList list2 = convertToList(intArray2);
		list1.prettyPrint();
		list2.prettyPrint();
		bubbleSort(list1);
		bubbleSort(list2);
		list1.prettyPrint();
		list2.prettyPrint();
		IntegerList list2 = convertToSortedList(intArray);
		list2.prettyPrint();
	}
	
	public static void main(String[] args) {
		ListUtilities listUtil = new ListUtilities();
		listUtil.launch();
	}
}