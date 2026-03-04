public class Screen{
	String name;
	String showTime;
	int screenNo;
	int seats;
	
	Screen(String name,String showTime,int screenNo,int seats){
		this.name=name;
		this.showTime=showTime;
		this.screenNo=screenNo;
		this.seats=seats;
	}
	
	 void bookTkt(int n){
		if(n>seats){
			System.out.println("Insufficient Seats");
		}
		else{
			seats-=n;
		}
	 }
	 void cancelTkt(int k){
		 seats+=k;
	 } 
	 
	 void details(){
		 System.out.println("Movie Name: "+name);
		 System.out.println("Show Time: "+showTime);
		 System.out.println("Screen No: "+screenNo);
		 System.out.println("Available Seats: "+seats);
		 
	 }
	}
