package day4.equalsDemo;

public class Employee {

	private String employeeName;
	private int empId;
	private int salary;
	private String workLocation;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(String employeeName, int empId, int salary, String workLocation) {
		super();
		this.employeeName = employeeName;
		this.empId = empId;
		this.salary = salary;
		this.workLocation = workLocation;
	}



	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (salary != other.salary)
			return false;
		if (workLocation == null) {
			if (other.workLocation != null)
				return false;
		} else if (!workLocation.equals(other.workLocation))
			return false;
		return true;
	}
	
	
}
























