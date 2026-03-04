public class International extends BluePrint{
	International(String shipId,double weight,String destination){
		super(shipId,weight,destination);
	}
	
	double cost;
	
	public void shippingCost(){
		cost=(getWeight()*200)+1000;
		System.out.println("----INTERNATIONAL----");
		System.out.println("Tracking Id: "+genTrackingId());
		System.out.println("Total Weight: "+getWeight());
		System.out.println("Total Cost: "+cost+"$");
		
	}
}