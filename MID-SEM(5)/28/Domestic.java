public class Domestic extends BluePrint{
	Domestic(String shipId,double weight,String destination){
		super(shipId,weight,destination);
	}
	
	double cost;
	
	public void shippingCost(){
		cost=(getWeight()*50);
		System.out.println("----DOMESTIC----");
		System.out.println("Tracking Id: "+genTrackingId());
		System.out.println("Total Weight: "+getWeight());
		System.out.println("Total Cost: "+cost+"$");
		
	}
}