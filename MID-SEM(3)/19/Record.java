public class Record{
	String id;
	String name;
	int number;
	String procedure;
	double cost;
	
	Record(String id,String name, int number){
		this.id=id;
		this.name=name;
		this.number=number;
	}
	
	void cleaning(){
		procedure="Cleaning";
		cost=500.00;
	}
	void filling(){
		procedure="Filling";
		cost=1500.00;
	}
	void extraction(){
		procedure="Extraction";
		cost=2000.00;
	}
	void rootCanal(){
		procedure="Root-Canal";
		cost=8000.00;
	}
	
	void reciept(){
		System.out.println("------------------------------");
		System.out.println("Patient ID: "+id );
		System.out.println("Patient Name: "+name);
		System.out.println("Patient Contact No: "+number);
		System.out.println("Tooth Procedure: "+procedure);
		System.out.println("Total cost: "+cost);
		System.out.println("------------------------------");
	}
}