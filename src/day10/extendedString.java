public class extendedString extends String {
	
	//This method will not work, as String is a final class; it cannot be extended
	public void printEven() {
		for (int i = 0; i < this.length(); i++) {
			if (i % 2 == 1) {
				System.out.print(this.substring(i,i+1));
			}
		}
	}
}