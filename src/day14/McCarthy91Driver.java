public class McCarthy91Driver {
	
	public void launch() {
		McCarthy91 mc = new McCarthy91();
		System.out.println(mc.mcCarthy91(50));
		System.out.println(mc.mcCarthy91(73));
		System.out.println(mc.mcCarthy91(95));
	}
	
	public static void main(String[] args) {
		McCarthy91Driver test = new McCarthy91Driver();
		test.launch();
	}
}