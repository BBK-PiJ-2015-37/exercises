class spScript{
	
	public void launch(){
	MobilePhone myPhone = new SmartPhone("Nokia");
	SmartPhone smrtPhone = (SmartPhone) myPhone;
	//System.out.println(myPhone.getBrand());
	//testPhone(myPhone);
	smrtPhone.browseWeb("www.google.com");
	System.out.println(smrtPhone.findPosition());
	smrtPhone.playGame("Space Invaders");
	smrtPhone.call("0049857398");
	}
	
	public void testPhone(Phone phone) {
		OldPhone oldPhone = (OldPhone) phone; 
		System.out.println(oldPhone.getBrand());
		oldPhone.call("04327582450");
		oldPhone.call("00532894304");
		/* phone.ringAlarm("06:00");
		phone.playGame("Space Invaders");
		phone.printLastNumber();
		phone.browseWeb("www.google.com");
		System.out.println(myPhone.findPosition()); */
	}
	
	
	public static void main(String[] args){
		spScript play = new spScript();
		play.launch();
	}
	
}