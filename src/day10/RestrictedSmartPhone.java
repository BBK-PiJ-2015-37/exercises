public class RestrictedSmartPhone extends SmartPhone {

	public RestrictedSmartPhone(String brand) {
		super(brand);
	}

	/**
	* Print on the screen: "Browsing... accessing <url>".
	*/
	public void browseWeb(String url) {
		System.out.println("Browsing... accessing " + url);
	}

	/**
	* Print on the screen a fictional GPS position.
	*/
	public String findPosition() {
		String position = "74.543 N, 34.764 W";		
		return position;
	}

	/**
	* @Override
	* Print on the screen: "<Name of game> -- it's the best game ever!".
	*/	
	private void playGame(String gameName) {
		System.out.println(gameName + " -- it's the best game ever!");
	}

	/**
	* Print on the screen: "Calling <number>...".
	* If number begins with 00, call via the internet.
	* Add number to recent calls array.
	*/
	public void call(String number) {
		if (number.substring(0,2).equals("00")) {
			System.out.println("Calling " + number + " through the internet to save money.");
			recentCallsArray[callsMade % 10] = number;
			callsMade++;
		} else {
			super.call(number);
		}
	}
}