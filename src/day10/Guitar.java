public class Guitar {
	public MusicalInstrument guitarAsInstrument = new MusicalInstrumentImp();
	public WoodenObject guitarAsWoodenObject = new WoodenObjectImp();
	
	public void burn() {
		guitarAsInstrument.play();
	}

	public void play() {
		guitarAsWoodenObject.burn();
	}
}