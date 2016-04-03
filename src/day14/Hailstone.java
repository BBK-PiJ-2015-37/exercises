import java.util.ArrayList;
import java.util.List;

public class Hailstone {
	private List<Integer> intList = new ArrayList<>();
	
	public List<Integer> hail(int n) {
		if (n == 0) {
			intList.add(0);
			return intList;
		} else if (n == 1) {
			intList.add(1);
			return intList;
		} else {
			intList.add(n);
			if (n % 2 == 0) {
				return hail(n / 2);
			} else {
				return hail(3 * n + 1);
			}
		}
	}
	
	public void clear() {
		intList.clear();
	}
	
}