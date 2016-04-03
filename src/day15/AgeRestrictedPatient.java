import java.util.Calendar;

public class AgeRestrictedPatient {
	private String name;
	private int yearOfBirth;
	
	public AgeRestrictedPatient(String name, int yearOfBirth) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		if ((yearOfBirth > currentYear) || (currentYear - yearOfBirth > 130)) {
			throw new IllegalArgumentException();
		} else {
			this.name = name;
			this.yearOfBirth = yearOfBirth;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getYOB() {
		return yearOfBirth;
	}
}