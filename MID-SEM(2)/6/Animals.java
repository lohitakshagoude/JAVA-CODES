public class Animals{
	String name;
	int age;
	String Diet;
	
	Animals(String name, int age, String Diet){
		this.name=name;
		this.age=age;
		this.Diet=Diet;
	}
	void sleep(){
		System.out.println("This Animal is Sleeping ");
	}
	void eat(){
		System.out.println("This Animal is Eating ");
	}
	
	void move(){}
}