import java.util.*;
class Weight{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
double weight;
double newweight;
int choice;
System.out.println("------Weight Conversion Program------");
System.out.println("1.KGS--->LBS");
System.out.println("2.LBS--->KGS");
System.out.print("Choose your option: ");
choice= scanner.nextInt();

if (choice==1){

System.out.print("Enter the weight in KGS: ");
weight=scanner.nextDouble();
newweight=weight*0.453592;
System.out.println("The weight in pounds: "+newweight);

}
else if (choice==2){

System.out.print("Enter the weight in LBS: ");
weight=scanner.nextDouble();
newweight=weight*2.20462;
System.out.println("The weight in kgs: "+newweight);

}
else{
System.out.print("INVALID OPTION!");
}
}

}