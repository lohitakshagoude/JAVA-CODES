public class Manager extends Lead{
	String Pname;
	double Pbudget;
	
	Manager(String name,String empId, double salary,int teamsize,double bonus
	                 ,String Pname, double Pbudget){
		super(name,empId,salary,teamsize,bonus);
		this.Pname=Pname;
		this.Pbudget=Pbudget;
	}
	
	void managerDetails(){
		leadDetails();
		System.out.println("Project Name: "+Pname);
		System.out.println("Project Budget: "+Pbudget);	
	}
}