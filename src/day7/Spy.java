public class Spy {
	private static int spyCount = 0;
	private int ID;

	public Spy(int id){
		this.ID = id;
		spyCount++;
		System.out.println("Spy ID: " + this.ID);
		System.out.println("Spies so far: " + spyCount);		
	}
	
	public void die(){
		System.out.println("Spy " + ID + " has been detected and eliminated");
		spyCount--;
		System.out.println("Spies remaining: " + spyCount);
	}
	
	public static void main(String[] args) {
		Spy spy1 = new Spy(1001);
		Spy spy15 = new Spy(1015);
		Spy spy34 = new Spy(1034);
		spy15.die();
		Spy spy16 = new Spy(1016);
		spy16.die();
		spy34.die();
		Spy spy2 = new Spy(1002);
		Spy spy3 = new Spy(1003);
	}
	
}