 public class Show{
	 public static void main(String[] args){
		 Temp temp1 = new Temp("SEN-001","Los-Santos","73T3GX3",33.04);
		 Temp temp2 = new Temp("SEN-002","Los-Angeles","73T3363w",12.99);
		 
		 
		 temp1.details();
		 System.out.println(temp1.getLocation());
		 temp1.getValue();
		 System.out.println("-------------------------------------");
		 temp2.details();
		 System.out.println(temp2.getLocation());
		 temp2.getValue();
		 System.out.println("Sensor Count: "+Temp.sensorCount);
		 
		 
		 Temp.CtoF();
	 }
 }