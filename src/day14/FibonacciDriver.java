public class FibonacciDriver {
	
	public void launch() {
		FibonacciCalc fib = new FibonacciCalc();
		long startTime = System.currentTimeMillis();
		int result = FibonacciCalc.fib(45);
		long endTime = System.currentTimeMillis();
		System.out.println("45th Fibonacci number: " + result);
		System.out.println("Time taken without memoization 1: " + (endTime - startTime) + "ms");
		startTime = System.currentTimeMillis();
		result = FibonacciCalc.fib(45);
		endTime = System.currentTimeMillis();
		System.out.println("45th Fibonacci number: " + result);
		System.out.println("Time taken without memoization 2: " + (endTime - startTime) + "ms");
		startTime = System.currentTimeMillis();
		result = fib.memoizedFib(45);
		endTime = System.currentTimeMillis();
		System.out.println("45th Fibonacci number: " + result);
		System.out.println("Time taken with memoization 1: " + (endTime - startTime) + "ms");
		startTime = System.currentTimeMillis();
		result = fib.memoizedFib(45);
		endTime = System.currentTimeMillis();
		System.out.println("45th Fibonacci number: " + result);
		System.out.println("Time taken with memoization 2: " + (endTime - startTime) + "ms");
		//Final call will be instantaneous, as value stored in array from previous call
	}
	
	public static void main(String[] args) {
		FibonacciDriver test = new FibonacciDriver();
		test.launch();
	}
}