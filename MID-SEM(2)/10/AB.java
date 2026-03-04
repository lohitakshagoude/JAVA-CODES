public class AB extends Spotify{
	int chapterCount;
	
	AB(String title,int duration,String artistName,int chapterCount){
		super(title,duration,artistName);
		this.chapterCount=chapterCount;
	}
	
	void abDetails(){
		spotDetails();
		System.out.println("Chapter-Count: "+chapterCount);
	}
}