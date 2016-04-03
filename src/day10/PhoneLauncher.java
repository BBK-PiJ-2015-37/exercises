public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		Phone myMobile = new SmartPhone("Sony Xperia Z3");
		SmartPhone mobile1 = (SmartPhone) myMobile;
		System.out.println(mobile1.findPosition());
		mobile1.browseWeb("http://www.lenta.ru");
		mobile1.ringAlarm("06:30");
		mobile1.playGame("Space Invaders");
		mobile1.call("07814233154");
		mobile1.call("07359532092");
		mobile1.call("07085832983");
		mobile1.call("07493189439");
		mobile1.call("07902357832");
		mobile1.call("007545734732");
		mobile1.call("07124839519");
		mobile1.call("0044432847382");
		mobile1.call("07493489410");
		mobile1.call("0013932477208");
		mobile1.call("074210948299");
		mobile1.printLastNumber();
		System.out.println(mobile1.getBrand());
	}
}