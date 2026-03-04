public class Man{
	public static void main(String[] args){
		Songs song = new Songs("Pagal",3,"Arpit-Bala","Love");
		Podcasts podcast = new Podcasts("lill",9,"kill",65);
		AB ab = new AB("NULL",69,"GILL",747);
		
		song.songDetails();
		podcast.podDetails();
		ab.abDetails();
	}
}