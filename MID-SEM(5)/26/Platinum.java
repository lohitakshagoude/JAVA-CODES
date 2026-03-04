abstract class Platinum{
	private int accNo;
	private double balance;
	
	protected String name;
	
	public static final double Wildintrest = 7.5;
	
	Platinum(String name,int accNo,double balance){
		this.name=name;
		this.accNo=accNo;
		this.balance=balance;
	}
	
	public double getBalance(){
		return balance;
	}
	public int getAccNo(){
		return accNo;
	}
	
	public String getName(){
		return name;
}

	public void setName(String Name){
		name=Name;
	}
	
	public void deposit(double n){
		balance+=n;
	}
	
	public void withdraw(double k){
		if(k>balance){
			System.out.println("Insufficient funds");
		}
		else{
			balance -=k;
		}
	}
	 abstract void calcIntrest();
	 abstract void dispStatement();
}