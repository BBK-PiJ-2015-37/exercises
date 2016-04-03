import java.util.List;
import java.util.ArrayList;

public class CodeFlowExercise {

	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CodeFlowExercise cf = new CodeFlowExercise();
		//cf.launch(0);		//Code executes through to line 25 (prints 2,3,4,5,6); error thrown at 26; caught at 29
		//cf.launch(2);		//Code executes through to line 21 (prints 4,5,6); error thrown at 22; caught at 29
		//cf.launch(4);		//Code executes through to line 17 (prints 6); error thrown at 18; caught at 29
		//cf.launch(6);		//Code executes through to line 15; error thrown at 16; caught at 29
	}
}