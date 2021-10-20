package packg1;

public class Employee {
	int empId;
	String name;
	String contactNo;
	
	public Employee() {}
	
	public Employee(int empId, String name, String contactNo) {
		super();
		this.empId = empId;
		this.name = name;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", contactNo=" + contactNo + "]";
	}

	
}
