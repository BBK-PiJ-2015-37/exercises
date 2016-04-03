public class McCarthy91 {
	
	/*
	 * All calls to the mcCarthy91 method should return 91
	 */
	public int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
}