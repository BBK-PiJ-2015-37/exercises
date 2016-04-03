public class MyCalcScript {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(7,5));
		System.out.println(calc.subtract(7,5));
		System.out.println(calc.multiply(7,5));
		System.out.println(calc.divide(7,5));
		System.out.println(calc.modulus(7,5));
	}
	
}