public class Company {
	protected DoublyLinkedList<String> employeeNames;
	protected DoublyLinkedList<Integer> natInsuranceNos;
	
	public Company() {
		employeeNames = new DoublyLinkedList();
		natInsuranceNos = new DoublyLinkedList();
	}
}