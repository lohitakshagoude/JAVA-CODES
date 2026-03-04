public class Museum{
	public static void main(String[] args){
		Painting painting = new Painting("P-001","BLAZE","Germany","OIL");
		Sculpture sculpture = new Sculpture("S-001","GLAZE","Sweden","COPPER");
		
		System.out.println("---------Welcome to the ROYAL-MUSEUM------------");
		System.out.println("Entry Fee: "+Artifact.fee);
		painting.showDescription();
		sculpture.showDescription();
		System.out.println("No of Artifacts: "+Artifact.artiCount);
		System.out.println("---------------------------------------------------------------------");
	}
}