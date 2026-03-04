 public class Temp{
	 public String sensorId;
	 protected String location;
	 private String key;
	 private double value;
	 public static final String  unit = "Celcius";
	 public static int sensorCount=0;
	 
	 Temp(String sensorId,String location,String key,double value){
		 this.sensorId=sensorId;
		 this.location=location;
		 this.key=key;
		 this.value=value;
		 
		 sensorCount++;
	 }
	 
	 public void details(){
		 System.out.println("Sensor Id: "+sensorId);
		 
	 }
	 
	 public String getLocation(){
		 return location;
	 }
	 
	  public String getKey(){
		 return key;
	 }
	   public double getValue(){
		 System.out.println("Temp in *C: "+value+" "+unit);
		 return value;
	 }
	 
	 public static void CtoF(int k){
		 double f = ((9.0/5)*k)+32;
		 System.out.println("Temp in *F: "+f+" Fahrenheit");
	 }
	 
 }