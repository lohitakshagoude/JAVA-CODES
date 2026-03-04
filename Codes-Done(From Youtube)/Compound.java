import java.util.Scanner;
public class Compound{
public static void main(String[] args){
Scanner scanner =new Scanner(System.in);
double principle;
double rate;
int timesCompounded;
int years;
double amount;

System.out.print("ENTER THE PRINCIPLE AMOUNT: ");
principle = scanner.nextDouble();

System.out.print("ENTER THE INTREST RATE IN % : ");
rate = scanner.nextDouble()/100;

System.out.print("ENTER THE NO OF TIMES COMPOUNDED PER YEAR: ");
timesCompounded = scanner.nextInt();

System.out.print("ENTER THE NO OF YEARS: ");
years = scanner.nextInt();

amount = principle*Math.pow(1+rate/timesCompounded,timesCompounded*years);

System.out.println("The amount after "+years+" is:$"+amount);



}}