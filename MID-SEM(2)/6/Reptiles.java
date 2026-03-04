public class Reptiles extends Animals{
	boolean isVenomous;
	
     Reptiles(String name, int age, String Diet,boolean isVenomous){
		super(name,age,Diet);
		this.isVenomous=isVenomous;
	}
		void details(){
		System.out.println("This is a "+age+" year old "+name+" ,which eats"+Diet+" and Venomous State:  "+isVenomous);
	}
	void move(){
		System.out.println("This Reptile is Crawling");
	}
}