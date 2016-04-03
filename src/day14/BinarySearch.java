import java.util.List;

public class BinarySearch {
	
	public boolean binarySearch(List<Integer> list, int intToFind) {
		if (list.size() == 0) {
			return false;
		} else if (list.size() == 1) {
			if (list.get(0).equals(intToFind)) {
				return true;
			} else {
				return false;
			}
		} else {
			int mid = list.get(list.size()/2);
			if (mid == intToFind) {
				return true;
			} else {
				if (intToFind < mid) {
					return binarySearch(list.subList(0, list.size()/2), intToFind);
				} else {
					return binarySearch(list.subList((list.size()/2) + 1, list.size()), intToFind);
				}
			}
		}
	}
}