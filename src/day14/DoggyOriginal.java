public class DoggyOriginal {
	
	/*
	 * The recursive call comes before the base case here.
	 * This will result in an infinite recursive loop and
	 * stack overflow.
	 */
	public String doggyMethod(int n) {
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		if (n <= 0) {
			return "";
		}
		return result;
	}
}	