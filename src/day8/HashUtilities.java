public class HashUtilities {
	
	/**
	 * Takes an integer and returns an integer between 0 and 1000
	 */
	public static int shortHash(int n) {
		return Math.abs(n % 1000);
	}
}