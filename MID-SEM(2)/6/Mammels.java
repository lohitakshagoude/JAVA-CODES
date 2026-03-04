public class Mammels extends Animals{
	String furColor;
	
	Mammels(String name, int age, String Diet,String furColor){
		super(name,age,Diet);
		this.furColor=furColor;
	}
	
	void details(){
		System.out.println("This is a "+age+" year old "+name+" ,which eats"+Diet+" and its color is "+furColor);
	}
	void move(){
		System.out.println("This Mammel is Running");
	}
}