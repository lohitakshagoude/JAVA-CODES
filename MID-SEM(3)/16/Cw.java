public class Cw{
	public static void main(String[] args){
		Car car1= new Car("TS8182","Lohith","i20","White");
		Car car2= new Car("TS8212","Vyshnav","I20","Red");
		Car car3= new Car("TS2e21","Pranav","Xuv 300","Wine");
		
		car1.fullService();
		car2.basicWash();
		car3.interiorClean();
		
		car1.carDetails();
		car2.carDetails();
		car3.carDetails();
	}
}