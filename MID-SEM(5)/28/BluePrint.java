abstract class BluePrint{
	private String shipId;
	private double weight;
	private String destination;
	abstract void shippingCost();
	public static final String  code="LOGI";
	public String trackingId="";
	
	public String getId(){
		return shipId;
	}
	public double getWeight(){
		return weight;
	}
	
	public void getDestination(){
		System.out.println("Destination: "+destination);
	}
	
	BluePrint(String shipId,double weight,String destination){
		this.shipId=shipId;
		this.weight=weight;
		this.destination=destination;
		
		
	}
	
	public String genTrackingId(){
		return shipId+"-"+code;
	}
	
}