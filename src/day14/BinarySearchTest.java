import java.util.ArrayList;
import java.util.List;

public class BinarySearchTest {
	
	public void launch() {
		BinarySearch bin = new BinarySearch();
		QuickSort qk = new QuickSort();
		List<Integer> list1 = new ArrayList<>(); //empty list
		List<Integer> list2 = new ArrayList<>(); //list with 1 element
		list2.add(5);
		List<Integer> list3 = new ArrayList<>(); //list with 2 elements
		list3.add(1);
		list3.add(3);
		List<Integer> list4 = new ArrayList<>(); //list with 3 elements
		list4.add(1);
		list4.add(3);
		list4.add(5);
		List<Integer> list5 = new ArrayList<>(); //list with 10 random elements
		for (int i = 0; i < 10; i++) {
			int j = (int) (Math.random() * 10);
			list5.add(j);
		}
		List<Integer> list6 = new ArrayList<>(); //list with 100 random elements
		for (int i = 0; i < 100; i++) {
			int j = (int) (Math.random() * 100);
			list6.add(j);
		}
		List<Integer> list7 = new ArrayList<>(); //list with 1000 random elements
		for (int i = 0; i < 1000; i++) {
			int j = (int) (Math.random() * 100);
			list7.add(j);
		}
		list5 = qk.quickSort(list5);
		list6 = qk.quickSort(list6);
		list7 = qk.quickSort(list7);
		System.out.println(bin.binarySearch(list1, 5)); //should return false
		System.out.println(bin.binarySearch(list2, 5)); //should returm true
		System.out.println(bin.binarySearch(list2, 7)); //should return false
		System.out.println(bin.binarySearch(list3, 2)); //should return false
		System.out.println(bin.binarySearch(list3, 3)); //should return true
		System.out.println(bin.binarySearch(list3, 1)); //should return true
		for (int i = 1; i < 6; i++) {
			System.out.println(bin.binarySearch(list4, i)); //should return true, false, true, false, true
		}
		System.out.println(bin.binarySearch(list5, 7));
		System.out.println(bin.binarySearch(list6, 37));
		System.out.println(bin.binarySearch(list7, 37));
	}
	
	public static void main(String[] args) {
		BinarySearchTest test = new BinarySearchTest();
		test.launch();
	}
} 