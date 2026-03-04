public class Savings extends Platinum{
	Savings(String name,int accNo,double balance){
		super(name,accNo,balance);
	}
	
	void calcIntrest(){
		double intrest = getBalance()*Wildintrest/100;
		deposit(intrest);
	}
	 void dispStatement() {
        System.out.println("Savings Account Statement");
        System.out.println("Name: " + getName());
        System.out.println("Balance: " + getBalance());
    }
}