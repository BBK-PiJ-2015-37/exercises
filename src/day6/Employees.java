public class Employees {
	private int[] idNumbers;
	private String[] names;
	
	public numberOfEmployees(int n) {
		idNumbers = new int[n];
		names = new String[n]
		for (int i = 0; i < n; i++) {
			idNumbers[i] = 0;
			names[i] = "";
		}
	}
	
	public setEmployeeDetails(int n, int identification, String name) {
		idNumbers[n-1] = identification;
		names[n-1] = name;
	}
	
	public getEmployeeDetails(int n) {
		System.out.println("ID: " + idNumbers[n-1]);
		System.out.println("Name: " + names[n-1]);
		System.out.println("");
	}
}