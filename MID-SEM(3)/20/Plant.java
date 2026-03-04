public class Plant{
	String id;
	String name;
	String type;
	double price;
	int stock;
	double total;
	Plant(String id, String name, String type,double price,int stock){
		this.id=id;
		this.name=name;
		this.type=type;
		this.price=price;
		this.stock=stock;
	}
	void sell(int n){
		if(n>stock){
			System.out.println("Sale cannot be processed");
		}
		else{
			stock-=n;
			total=n*price;
		}
	}
	void restock(int k){
		stock+=k;
	}
	
	void details(){
		System.out.println("Plant Id: "+id);
		System.out.println("Plant Name: "+name);
		System.out.println("Plant Type: "+type);
		System.out.println("Price: "+price);
		System.out.println("Stock: "+stock);
		
		
		
	}
	
	void bill(){
		System.out.println("Plant Id: "+id);
		System.out.println("Plant Name: "+name);
		System.out.println("Plant Type: "+type);
		System.out.println("Total Price: "+price);
	}
}