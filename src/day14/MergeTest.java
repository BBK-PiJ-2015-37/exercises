import java.util.ArrayList;
import java.util.List;

public class MergeTest {
	
	public void launch() {
		MergeSort merger = new MergeSort();
		List<Integer> list1 = new ArrayList<>(); //empty list
		List<Integer> list2 = new ArrayList<>(); //list with 1 element
		list2.add(5);
		List<Integer> list3 = new ArrayList<>(); //list with 2 elements in order
		list3.add(1);
		list3.add(3);
		List<Integer> list4 = new ArrayList<>(); //list with 2 elements out of order
		list4.add(3);
		list4.add(1);
		List<Integer> list5 = new ArrayList<>(); //list with 3 elements in order
		list5.add(1);
		list5.add(3);
		list5.add(5);
		List<Integer> list6 = new ArrayList<>(); //list with 3 elements out of order
		list6.add(5);
		list6.add(3);
		list6.add(1);
		List<Integer> list7 = new ArrayList<>(); //list with 20 random elements
		for (int i = 0; i < 20; i++) {
			int j = (int) (Math.random() * 100);
			list7.add(j);
		}
		System.out.println(merger.mergeSort(list1));
		System.out.println(merger.mergeSort(list2));
		System.out.println(merger.mergeSort(list3));
		System.out.println(merger.mergeSort(list4));
		System.out.println(merger.mergeSort(list5));
		System.out.println(merger.mergeSort(list6));
		System.out.println(merger.mergeSort(list7));
	}
	
	public static void main(String[] args) {
		MergeTest test = new MergeTest();
		test.launch();
	}
}