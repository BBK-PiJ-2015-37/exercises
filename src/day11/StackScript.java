public class StackScript {
	
	public void launch() {
		Stack<Integer> intStack = new Stack<>();
		System.out.println(intStack.isEmpty());
		intStack.push(4);
		intStack.push(3);
		intStack.push(2);
		int popped1 = intStack.pop();
		System.out.println("Popped: " + popped1);
		System.out.println(intStack.isEmpty());
		Stack<Double> dblStack = new Stack<>();
		System.out.println(dblStack.isEmpty());
		dblStack.push(4.4039830912);
		dblStack.push(3.4873264717);
		dblStack.push(2.30927493);
		Double popped2 = dblStack.pop();
		System.out.println("Popped: " + popped2);
		System.out.println(dblStack.isEmpty());
		Stack<String> strStack = new Stack<>(); //error thrown during compilation
	}
	
	public static void main(String[] args) {
		StackScript script = new StackScript();
		script.launch();
	}
}