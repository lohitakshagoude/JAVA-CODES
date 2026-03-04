public class Device{
	String name;
	String version;
	String status;
	
	Device(){
		this.name="SG-Device";
		this.version="v1.0";
		this.status="Inactive";
	}
	Device(String name, String version){
		this.name=name;
		this.version=version;
		this.status="Inactive";
	}
	Device(String name,String version,String status){
		this.name=name;
		this.version=version;
		this.status=status;
	}
	
	void details(){
		System.out.println("Device Name: "+name);
		System.out.println("Device Version: "+version);
		System.out.println("Device Status: "+status);
		System.out.println("------------------------");
	}
	
	public static void main(String[] args){
		Device assembly = new Device();
		Device testing = new Device("Samsung S-24","v6.9");
		Device sale = new Device("Samsung S-24","v7.0","Active");
		
		assembly.details();
		testing.details();
		sale.details();
	}
}