public class Emp{
	private String name;
	private String empId;
	private double salary;
	
	Emp(String name,String empId, double salary){
		this.name=name;
		this.empId=empId;
		this.salary=salary;
	}
	
	void empDetails(){
		System.out.println("Name: "+name);
		System.out.println("EmpID: "+empId);
		System.out.println("Salary: "+salary);
	}
}