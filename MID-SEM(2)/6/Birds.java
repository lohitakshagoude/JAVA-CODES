public class Birds extends Animals{
	   int wingSpan;
	
	Birds(String name, int age, String Diet,int wingSpan){
		super(name,age,Diet);
		this.wingSpan=wingSpan;
	}
		void details(){
		System.out.println("This is a "+age+" year old "+name+" ,which eats"+Diet+" and its wingSpan is "+wingSpan+"cm");
	}
	void move(){
		System.out.println("This Bird is Flying");
	}
}