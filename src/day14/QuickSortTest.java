import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {
	
	public void launch() {
		QuickSort quick = new QuickSort();
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
		System.out.println(quick.quickSort(list1));
		System.out.println(quick.quickSort(list2));
		System.out.println(quick.quickSort(list3));
		System.out.println(quick.quickSort(list4));
		System.out.println(quick.quickSort(list5));
		System.out.println(quick.quickSort(list6));
		System.out.println(quick.quickSort(list7));
	}
	
	public static void main(String[] args) {
		QuickSortTest test = new QuickSortTest();
		test.launch();
	}
}