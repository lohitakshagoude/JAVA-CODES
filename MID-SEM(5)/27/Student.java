public class Student{
	private String aadhaarNo;
	
	public void seeAadhaar(){
		System.out.println("Aadhaar No: "+aadhaarNo);
	}
	
	protected  int intMarks;
	public void seeMarks(){
		System.out.println("Internal Marks: "+intMarks);
	}
	
	public String name;
	public int rollNo;
	
	public static final String motto="Knowledge is Power";
	
	public static int stuCount=0;
	
	Student(String name, int rollNo,int intMarks,String aadhaarNo){
		this.name=name;
		this.rollNo=rollNo;
		this.intMarks=intMarks;
		this.aadhaarNo=aadhaarNo;
		
		stuCount++;
	}
	
	void details(){
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollNo);
	}

}