public class GuitarScript {
	
	public static void main(String[] args) {
		GuitarScript guitarTest = new GuitarScript();
		guitarTest.launch();
	}
	
	public void launch() {
		Guitar guitar = new Guitar();
		guitar.play();
		guitar.burn();
	}
}