import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	
	public List<Integer> quickSort(List<Integer> list) {
		List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		if (list.size() <= 1) {
			return list;
		} else {
			int pivot = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i) < pivot) {
					leftList.add(list.get(i));
				} else {
					rightList.add(list.get(i));
				}
			}
			leftList = quickSort(leftList);
			rightList = quickSort(rightList);
			result = leftList;
			result.add(pivot);
			result.addAll(rightList);
			return result;
		}
	}
}