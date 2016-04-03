public class Calculator {
	
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	public int subtract(int a, int b) {
		int result = a - b;
		return result;
	}
	
	public int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	public double divide(int a, int b) {
		double x = (double) a;
		double result = x / b;
		return result;
	}

	public int modulus(int a, int b) {
		int result = a % b;
		return result;
	}

}