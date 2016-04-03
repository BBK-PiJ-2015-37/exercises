public class ComparatorTester {
	
	public void launch() {
		Comparator compare = new Comparator();
		System.out.println(compare.getMax(4,8));
		System.out.println(compare.getMax(4.0,8.0));
		System.out.println(compare.getMax("4","8"));
	}
	
	public static void main(String[] args) {
		ComparatorTester tester = new ComparatorTester();
		tester.launch();
	}	
}
