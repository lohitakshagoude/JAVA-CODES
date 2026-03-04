public class Profile{
	int age;
	String vehicle;
	
	Profile(int age,String vehicle){
		this.age=age;
		this.vehicle=vehicle;
	}
	
	void check(){
		
		System.out.println("Age: " + age);
        System.out.println("License Applied: " + vehicle);
		if(vehicle.equalsIgnoreCase("Car")){
			if(age>=18){
				System.out.println("you are eligible");
			}
			else{
				System.out.println("You are not eligible");
			}
		}
		
		else	if(vehicle.equalsIgnoreCase("Commercial Vehicle")){
			if(age>=20){
				System.out.println("you are eligible");
			}
			else{
				System.out.println("You are not eligible");
			}
		}
		else	if(vehicle.equalsIgnoreCase("Motorcycle")){
			if(age>=16){
				System.out.println("you are eligible");
			}
			else{
				System.out.println("You are not eligible");
			}
		}
		else{
			System.out.println("Invalid Vehicle");
		}
		
	}
}