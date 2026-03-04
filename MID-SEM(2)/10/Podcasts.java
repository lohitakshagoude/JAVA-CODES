public class Podcasts extends Spotify{
	int epNo;
	
	Podcasts(String title,int duration,String artistName,int epNo){
		super(title,duration,artistName);
		this.epNo=epNo;
	}
	
	void podDetails(){
		spotDetails();
		System.out.println("Episode-No: "+epNo);
	}
}