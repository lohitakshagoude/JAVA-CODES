public class Dock{
	public static void main(String[] args){
		Domestic domes = new Domestic("SH34",6000,"Las-Santos");
		International inter = new International("SH67",90000,"Bermuda");
		
		System.out.println("-----------"+BluePrint.code+"pvt.ltd------------");
		domes.shippingCost();
		domes.getDestination();
		inter.shippingCost();
		inter.getDestination();
	}
}