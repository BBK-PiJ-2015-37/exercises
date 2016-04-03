import java.util.ArrayList;
import java.util.List;

public class Sorter {
	List<Integer> result = new ArrayList<>();
	
	public List<Integer> mergeSort(List<Integer> list) {
		if ((list.size() == 0) || (list.size() == 1)) {
			return list;
		}
		else {
			List<Integer> firstHalf = list.subList(0, list.size()/2);
			List<Integer> secondHalf = list.subList(list.size()/2, -1);
			mergeSort(firstHalf);
			mergeSort(secondHalf);
		}
	}
}