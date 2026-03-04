public class Current extends Platinum{
	Current(String name,int accNo,double balance){
		super(name,accNo,balance);
	}
	
		void calcIntrest(){
		System.out.println("Current acoount has no intrest");
	}
	
	 void dispStatement() {
        System.out.println("Current Account Statement");
        System.out.println("Name: " + getName());
        System.out.println("Balance: " + getBalance());
    }
}