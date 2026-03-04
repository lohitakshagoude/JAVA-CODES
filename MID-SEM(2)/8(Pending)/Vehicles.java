public class Vehicles{
	String registrationNumber;
	String fuelType;
	int maxSpeed;
	
	Vehicles(String registrationNumber, String fuelType, int maxSpeed){
		this.registrationNumber=registrationNumber;
		this.fuelType=fuelType;
		this.maxSpeed=maxSpeed;
	}
	
	void start(){
		System.out.println("This vehicle is started");
	}
	
	void stop(){
		System.out.println("This vehicle is stopped");
	}
}