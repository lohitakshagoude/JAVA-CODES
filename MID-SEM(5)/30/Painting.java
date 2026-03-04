public class Painting extends Artifact{
	public String  medium;
	
	Painting(String id,String name,String country,String  medium){
		super(id,name,country);
		this.medium=medium;
	}
	
	void showDescription(){
		System.out.println("-------------P A I N T I N G--------------");
		System.out.println("Painting-ID:                 "+id);
		System.out.println("Painting Name:            "+name);
		System.out.println("Country of Origin:      "+country);
		System.out.println("Medium Used:             "+medium);
		System.out.println("-------------------------------------------------");
	}
}