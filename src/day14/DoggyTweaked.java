public class DoggyTweaked {
	
	/*
	 * The base case comes before the recursive call here.
	 * This allows the code to execute.
	 */
	public String doggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		return result;
	}
}	