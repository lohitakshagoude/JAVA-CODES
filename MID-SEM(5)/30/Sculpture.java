public class Sculpture extends Artifact{
	public String  material;
	
	Sculpture(String id,String name,String country,String  material){
		super(id,name,country);
		this.material=material;
	}
	
	void showDescription(){
		System.out.println("-------------S C U L P T U R E--------------");
		System.out.println("Sculpture-ID:                  "+id);
		System.out.println("Sculpture Name:             "+name);
		System.out.println("Country of Origin:         "+country);
		System.out.println("Material Used:                "+material);
		System.out.println("-------------------------------------------------");
	}
}