public class DoggyDriver {
	
	public void launch() {
		/* DoggyOriginal doggy = new DoggyOriginal();
		for (int i = 0; i < 16; i++) {
			System.out.println(doggy.doggyMethod(i));
		} */
		DoggyTweaked doggy = new DoggyTweaked();
		for (int i = 0; i < 16; i++) {
			System.out.println(doggy.doggyMethod(i));
		}	
	}
	
	public static void main(String[] args) {
		DoggyDriver test = new DoggyDriver();
		test.launch();
	}
}