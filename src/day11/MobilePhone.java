public class MobilePhone extends OldPhone {
	protected String[] recentCallsArray = new String[10];
	protected int callsMade = 0;

	public MobilePhone(String brand) {
		super(brand);
	}
	
	/**
	* Print on the screen: "It's <time> -- wake up!".
	*/
	public void ringAlarm(String time) {
		System.out.println("It's " + time + " -- wake up!");
	}

	/**
	* Print on the screen: "<Name of game> -- it's the best game ever!".
	*/	
	private void playGame(String gameName) {
		System.out.println(gameName + " -- it's the best game ever!");
	}

	/**
	* Print on the screen: "Calling <number>...".
	* Add number to recent calls array.
	*/
	public void call(String number) {
		super.call(number);
		recentCallsArray[callsMade % 10] = number;
		callsMade++;
	}

	/**
	* Print on the screen last 10 numbers called.
	*/
	public void printLastNumber() {
		System.out.println("Last 10 numbers called:");
		for (int i = 0; i < recentCallsArray.length; i++) {
			System.out.println(recentCallsArray[i]);
		}
	}
}