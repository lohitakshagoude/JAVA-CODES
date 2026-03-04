public class School{
	public static void main(String[] args){
		Student stu1= new Student("Lohith",14,55,"9838476464764");
		Student stu2= new Student("Vyshnav",15,50,"9838476874764");
		
		System.out.println("-------"+Student.motto+"--------");
		stu1.details();
		stu1.seeAadhaar();
		stu1.seeMarks();
		System.out.println("---------------------------------------");
		stu2.details();
		stu2.seeAadhaar();
		stu2.seeMarks();
		System.out.println("---------------------------------------");
		System.out.println("Student Count: "+Student.stuCount);
	}
}