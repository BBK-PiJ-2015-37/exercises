public class TargetScript {

	public static void main(String[] args) {
		System.out.println("*****ANTI-AIRCRAFT AIM*****");
		boolean finished = false;
		while(!finished) {
			boolean validField = false;
			int dim = 0;
			while (!validField) {
				System.out.print("Enter an integer representing dimensions of playing field: ");
				dim = Integer.parseInt(System.console().readLine());
				if (dim < 0) {
					System.out.println("Enter an integer greater than zero.");
				} else {
					validField = true;
				}
			}
			Target target = new Target(dim);
			target.init();
			System.out.println("Here they come! Try to bring the plane down!");
			boolean successful = false;
			while (!successful) {
				System.out.print("Enter a coordinate X: ");
				int x = Integer.parseInt(System.console().readLine());
				System.out.print("Enter a coordinate Y: ");
				int y = Integer.parseInt(System.console().readLine());
				System.out.print("Enter a coordinate Z: ");
				int z = Integer.parseInt(System.console().readLine());
				Result result = target.fire(x,y,z);
				switch (result) {
					case HIT:
						System.out.println("You hit it! Well done!");
						successful = true;
						break;
					case OUT_OF_RANGE:
						System.out.println("That shot is way out of range. Try harder!");
						break;
					case FAIL_LEFT:
						System.out.println("You missed! The target is to the left!");
						break;
					case FAIL_RIGHT:
						System.out.println("You missed! The target is to the right!");
						break;
					case FAIL_LOW:
						System.out.println("You missed! The target is lower!");
						break;
					case FAIL_HIGH:
						System.out.println("You missed! The target is higher!");
						break;
					case FAIL_SHORT:
						System.out.println("You missed! The target is closer than that!");
						break;
					case FAIL_LONG:
						System.out.println("You missed! The target is further away than that!");
						break;
				}
			}
			System.out.print("Would you like to play again? Enter y/n: ");
			String again = System.console().readLine();
			boolean valid = false;
			while (!valid) {
				if (!(again.equals("n")) && !(again.equals("y"))) {
					System.out.println("Invalid input. Try again.");
				} else if (again.equals("y")) {
					valid = true;
				} else if (again.equals("n")) {
					finished = true;
					valid = true;
				}
			}
		}
		System.out.println("Thanks for playing!");
	}
}