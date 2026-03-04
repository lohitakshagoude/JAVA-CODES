public class Car{
	String lcNo;
	String name;
	String model;
	String color;
	String wash;
	
	Car(String lcNo,String name,String model,String color){
		this.lcNo=lcNo;
		this.name=name;
		this.model=model;
		this.color=color;
	}
	
	
	void basicWash(){
		wash="Your car had a Basic Exterior wash";
	}
	void interiorClean(){
		wash="Your car had Interior Vacuum Cleaning";
	}
	void fullService(){
		wash="Your car had a Full Detail Service";
	}
	void carDetails(){
		System.out.println("-------------------------------");
		System.out.println("Owner Name: "+name);
		System.out.println("Car Model: "+model);
		System.out.println("Car Colour: "+color);
		System.out.println("License No: "+lcNo);
		System.out.println("Service: "+wash);
		System.out.println("-------------------------------");
	}
	
}