import java.util.List;
import java.util.ArrayList;

/*
 * This code will not compile as the NullExceptionPointer caught in
 * line 23 is already caught by the Exception handler on line 21.
 * General exception handlers are bad practice, as  they make it harder
 * for a programmer to ascertain the exact nature of the error; furthermore,
 * the general error catch does not allow for different handlings of different
 * exceptions. 
 */

public class ExceptionExercise {
	
	public void launch() {
		List<Integer> list = new ArrayList<>();
		try {
			list.add(6);
			list.add(5);
			System.out.println(list.get(2)); 
		} catch (Exception ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExceptionExercise ee = new ExceptionExercise();
		ee.launch();
	}
}
