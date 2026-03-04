public class Songs extends Spotify{
	String genre;
	
	Songs(String title,int duration,String artistName,String genre){
		super(title,duration,artistName);
		this.genre=genre;
	}
	
	void songDetails(){
		spotDetails();
		System.out.println("Genre: "+genre);
	}
}