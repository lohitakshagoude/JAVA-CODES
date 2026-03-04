public class RS extends Student{
	String researchTopic;
	String guideName;
	
	RS(String name,int ID, String department,double cgpa,String researchTopic,String guideName){
		super(name,ID,department,cgpa);
		this.researchTopic=researchTopic;
		this.guideName=guideName;
	}
	
	void details(){
		personDetails();
		studentDetails();
		System.out.println("Student's Research Topic: "+researchTopic);
		System.out.println("Student's Guide Name: "+guideName);
	}
}