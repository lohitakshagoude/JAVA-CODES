public class Hotel{
	String name;
	String roomtype;
	int floor;
	double price;
	
	Hotel(){
		this.name="Walk-in Guest";
		this.roomtype="Standard";
		this.floor=0;
		this.price=2000.00;
	}
	
	Hotel(String name, String roomtype, int floor,double price){
		this.name=name;
		this.roomtype=roomtype;
		this.floor=floor;
		this.price=price;
	}
	
	Hotel(Hotel ref, String newName){
		this.name=newName;
		this.roomtype=ref.roomtype;
		this.floor=ref.floor;
		this.price=ref.price;
	}
	
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Roomtype: "+roomtype);
		System.out.println("Floor no: "+floor);
		System.out.println("Nightly Price: "+price);
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args){
		
		Hotel walkIn = new Hotel();
		Hotel online = new Hotel("Lohith","Luxe",15,10000.00);
		Hotel ref = new Hotel (online, "Vyshnav");
		
		walkIn.display();
		online.display();
		ref.display();
	}
}