public class PersonTestManual {
	
	public void launch() {
		Person p = new Person();
		String input = "Barack Henry  Obama";
		String[] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println(p.getInitials(input));
	}
	
	public static void main(String[] args) {
		PersonTestManual tester = new PersonTestManual();
		tester.launch();
	}
}