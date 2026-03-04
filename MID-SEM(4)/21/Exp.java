import java.util.*;
public class Exp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int exp;
		double salary;
		
		System.out.print("Enter your Experience Age: ");
		exp = sc.nextInt();
		
		System.out.print("Enter your Salary: ");
		salary = sc.nextDouble();
		
		double Bonus = bonus(exp,salary);
		
		
		int choice;
		
		System.out.print("Do you work in Hazard(1) or No(2):");
		choice=sc.nextInt();
		
		if (choice==1){
			System.out.println("You got flat 5000 extra");
			salary+=5000;
			System.out.println("Salary+Bonus+Hazard="+(Bonus+salary));
		}
			else if (choice==2){
			System.out.println("You got nothing extra ");
			salary=salary;
			System.out.println("Salary+Bonus="+(Bonus+salary));

		}
		
	}
	
	static double bonus(int exp,double salary){
	if (exp < 2) {
    return 0;
}
else if (exp >= 2 && exp < 5) {
    return 0.1 * salary;
}
else if (exp >= 5 && exp < 10) {
    return 0.2 * salary;
}
else {
    return 0.3 * salary;
}
	}
}