public class Zoo{
	public static void main(String[] args){
		Mammels mammel = new Mammels("Bear",45,"Fishes","Brown");
		Birds bird = new Birds("Parrot",3,"Nuts",67);
		Reptiles reptile = new Reptiles("Crocodile",100,"Humans",false);
		
		mammel.details();
		mammel.eat();
		mammel.sleep();
		mammel.move();
		System.out.println("-----------------------------");
		
		bird.details();
		bird.eat();
		bird.sleep();
		bird.move();
		System.out.println("-----------------------------");
		
		reptile.details();
		reptile.eat();
		reptile.sleep();
		reptile.move();
		System.out.println("-----------------------------");
		}
}