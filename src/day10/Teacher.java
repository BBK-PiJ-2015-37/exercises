// Teacher.java
public class Teacher {
	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	/**
	 * Return teacher's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Print to screen "Teaching lesson: <lesson name>".
	 */
	public void teach(String lessonName) {
		System.out.println("Teaching lesson: " + lessonName);
	}
}