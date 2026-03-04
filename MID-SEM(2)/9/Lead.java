public class Lead extends Emp{
	int teamsize;
	double bonus;
	
	Lead(String name,String empId, double salary,int teamsize,double bonus){
		super(name,empId,salary);
		this.teamsize=teamsize;
		this.bonus=bonus;
		
	}
	
	void leadDetails(){
		empDetails();
        System.out.println("Team Size: "+teamsize);
		System.out.println("Bonus: "+bonus);
	}
}