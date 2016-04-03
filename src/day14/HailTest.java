import java.util.ArrayList;
import java.util.List;

public class HailTest {
	
	public void launch() {
		Hailstone hail = new Hailstone();
		List<Integer> result = hail.hail(10);
		System.out.println(result);
		hail.clear();
		result = hail.hail(20);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		HailTest test = new HailTest();
		test.launch();
	}
}