public class Edu{
	String name;
	String course;
	static int counter =100;
	int rollNo;
	Edu(){
		this.name="Un-Assigned";
		this.rollNo=0;
		this.course="General";
	}
	Edu(String name, String course){
		rollNo=++counter;
		this.name=name;
		this.course=course;
	}
	Edu(Edu old){
		this.name=old.name;
		this.course=old.course;
		rollNo=++counter;
	}
	void details(){
	      System.out.println("Student Name: "+name);
		  System.out.println("Student RollNo: "+rollNo);
		  System.out.println("Student Course: "+course);
		  System.out.println("--------------------------------");
	}
	public static void main(String[] args){
		Edu stu1 = new Edu();
		Edu stu2 = new Edu("Lohith","CSE");
		Edu stu3 = new Edu("Vyshnav","AIE");
		Edu stu4 = new Edu(stu3);
		
		stu1.details();
		stu2.details();
		stu3.details();
		stu4.details();
	}
}