public class Profile{
	String Id;
	String name;
	int age;
	String type;
	double fee;
	String discount;
	
	Profile(String Id, String name, int age, String type,
	             double fee){
		this.Id=Id;
		this.name=name;
		this.age=age;
		this.type=type;
		this.fee=fee;
	}
	
	void yDiscount(){
		if(age<25){
			discount="You are applicable For Discount";
			fee=fee-0.25*fee;
		}
		else{
			discount="You are not applicable for Discount";
			fee=fee;
		}
		System.out.println("Discount: "+discount);
		System.out.println("Fee After Discount: "+fee);
	}
	
	void details(){
		System.out.println("Member ID: "+Id);
		System.out.println("Member Name: "+name);
		System.out.println("Member Age: "+age);
		System.out.println("Membership Type: "+type);
		System.out.println("Fee: "+fee);
		System.out.println("-----------------------------------");
	}
	
	
}