public class Student extends Person{
	String department;
	double cgpa;
	
	Student(String name,int ID,String department,double cgpa){
		super(name,ID);
		this.department=department;
		this.cgpa=cgpa;
	}
	void studentDetails(){
	   System.out.println("Student Department: "+department);
		System.out.println("Student CGPA: "+cgpa);
	}
}