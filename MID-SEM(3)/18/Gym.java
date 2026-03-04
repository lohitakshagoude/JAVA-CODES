public class Gym{
	
	public static void main(String[] args){
		Profile one = new Profile("KA1","Lohith",22,"Annual",2000.0);
		Profile two = new Profile("KA2","Vyshnav",28,"Monthly",1000.0);
		Profile three = new Profile("KA3","Aditya",21,"Quaterly",1500.0);
		Profile four = new Profile("KA4","Irfan",55,"Annual",2000.0);
		
		one.details();
		two.details();
		three.details();
		four.details();
		
		
		one.yDiscount();
		two.yDiscount();
		three.yDiscount();
		four.yDiscount();
		
		
		
	}
    
}