public class Clinic{
	public static void main(String[] args){
		Record p1 = new Record("K91","Likitha",9989);
		Record p2 = new Record("K92","Likith",9983);
		Record p3 = new Record("K93","Likit",9982);
		Record p4 = new Record("K94","Liki",9981);
		
		p1.cleaning();
		p1.filling();
		p3.extraction();
		p4.rootCanal();
		
		p1.reciept();
		p2.reciept();
		p3.reciept();
		p4.reciept();
	}
}