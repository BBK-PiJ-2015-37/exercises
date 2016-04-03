public class MyExceptionTester {
	
	public void launch() throws MyCheckedException, MyUncheckedException {
		try {
			System.out.println("Inside the try block...");
			System.out.print("Test checked (enter C) or unchecked (enter anything else)?: ");
			String input = System.console().readLine();
			if (input.equals("C")) {
				throw new MyCheckedException("I am a checked exception and I have been thrown inside a try block.");
			} else {
				throw new MyUncheckedException("I am an unchecked exception and I have been thrown inside a try block.");
			}
		} catch (MyCheckedException ex) {
			System.out.println(ex.getMessage());
		} catch (MyUncheckedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Outside the try block...");
		System.out.print("Test checked (enter C) or unchecked (enter anything else)?: ");
		String input = System.console().readLine();
		if (input.equals("C")) {
			throw new MyCheckedException("I am a checked exception and I have been thrown outside a try block.");
		} else {
			throw new MyUncheckedException("I am an unchecked exception and I have been thrown outside a try block.");
		}
	}
	
	public static void main(String[] args)throws MyCheckedException, MyUncheckedException {
		MyExceptionTester test = new MyExceptionTester();
		test.launch();
	}
}