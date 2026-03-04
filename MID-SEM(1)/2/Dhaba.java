public class Dhaba{
	String item;
	int quantity;
	String address;
	String instruction;
	
	Dhaba(){
		this.item="Veg-Combo";
		this.quantity=1;
		this.address="To be updated";
		this.instruction="Not-Specified";
		
	}
	Dhaba(String item, int quantity){
		this.item=item;
		this.quantity=quantity;
		this.address="Home Address on File";
		this.instruction="Not-Specified";
		
	}
	Dhaba(String item,int quantity,String address,String instruction){
		this.item=item;
		this.quantity=quantity;
		this.address=address;
		this.instruction=instruction;
	}
	
	void bill(){
		System.out.println("Item:                  "+item);
		System.out.println("Quantity:           "+quantity);
		System.out.println("Adress:               "+address);
		System.out.println("Instruction:        "+instruction);
		System.out.println("--------------------------------------");
	}
	
	public static void main(String[] args){
		Dhaba customer1= new Dhaba();
		Dhaba customer2= new Dhaba("Pizza",3);
		Dhaba customer3= new Dhaba("Burger",9,"Daytona-Circle House-no: 145","Cook medium rare & mild Salt");
		
		customer1.bill();
		customer2.bill();
		customer3.bill();
	}
}