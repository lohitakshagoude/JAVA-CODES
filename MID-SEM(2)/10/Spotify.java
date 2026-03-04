public class Spotify{
	String title;
	int duration;
	String artistName;
	
	Spotify(String title,int duration,String artistName){
		this.title=title;
		this.duration=duration;
		this.artistName=artistName;
	}
	
	void spotDetails(){
		System.out.println("Title: "+title);
		System.out.println("Duration: "+duration+"min");
		System.out.println("Artist-Name: "+artistName);
	}
}