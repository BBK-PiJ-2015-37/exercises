public class CompanyScript {
	
	public void launch() {
		Company comp = new Company();
		System.out.println("Name list empty?: " + comp.employeeNames.isEmpty());
		System.out.println("ID list empty?: " + comp.natInsuranceNos.isEmpty());
		comp.employeeNames.add("John Smith");
		comp.natInsuranceNos.add(4325894);
		comp.employeeNames.add("Margaret Baker");
		comp.natInsuranceNos.add(4937295);
		comp.employeeNames.add("Tom Killian");
		comp.natInsuranceNos.add(4028570);
		comp.employeeNames.add("Caroline Chaucer");
		comp.natInsuranceNos.add(4298191);
		comp.employeeNames.add("Rebecca Waites");
		comp.natInsuranceNos.add(4918592);
		comp.employeeNames.printForwards();
		comp.natInsuranceNos.printForwards();
		System.out.println("Name list empty?: " + comp.employeeNames.isEmpty());
		System.out.println("ID list empty?: " + comp.natInsuranceNos.isEmpty());
		System.out.println("Name list size: " + comp.employeeNames.size());
		System.out.println("ID list size: " + comp.natInsuranceNos.size());
		comp.employeeNames.remove("Margaret Baker");
		comp.natInsuranceNos.remove(4937295);
		System.out.println("Name list size: " + comp.employeeNames.size());
		System.out.println("ID list size: " + comp.natInsuranceNos.size());
		comp.employeeNames.printBackwards();
		comp.natInsuranceNos.printBackwards();
	}
	
	public static void main(String[] args) {
		CompanyScript tester = new CompanyScript();
		tester.launch();
	}
}