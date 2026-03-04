abstract class Artifact{
	 public String id;
	 public String name;
	 public String country;
	  abstract void showDescription();
	  public static final int fee= 500;
	  public static int artiCount=0;
	  
	  Artifact(String id,String name,String country){
		  this.id=id;
		  this.name=name;
		  this.country=country;
		  
		  artiCount++;
	  }
}