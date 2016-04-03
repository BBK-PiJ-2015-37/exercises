import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	public List<Integer> mergeSort(List<Integer> list) {
		List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		if (list.size() <= 1) {
			return list;
		} else {
			int middle = list.size()/2;
			for (int i = 0; i < middle; i++) {
				leftList.add(list.get(i));
			}
			for (int i = middle; i < list.size(); i++) {
				rightList.add(list.get(i));
			}
			leftList = mergeSort(leftList);
			rightList = mergeSort(rightList);
			if (leftList.get(leftList.size() - 1) <= rightList.get(0)) {
				leftList.addAll(rightList);
				return leftList;
			}
			result = merge(leftList, rightList);
			return result;
		}
	}
	
	private List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> result = new ArrayList<>();
		while ((left.size() > 0) && (right.size() > 0)) {
			if (left.get(0) <= right.get(0)) {
				result.add(left.get(0));
				left.remove(0);
			} else {
				result.add(right.get(0));
				right.remove(0);
			}
		}
		if (left.size() > 0) {
			result.addAll(left);
		}
		if (right.size() > 0) {
			result.addAll(right);
		}
		return result;
	}
}