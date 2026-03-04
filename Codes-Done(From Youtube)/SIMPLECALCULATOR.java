import java.util.Scanner;
public class SIMPLECALCULATOR{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

double first;
double second;

double result;

System.out.println("--WELCOME TO LOHITH'S CALCULATOR--");
System.out.println();

System.out.print("Enter your first number: ");
first=scanner.nextDouble();

System.out.print("Enter your operator (+,-,/,*): ");
char operator=scanner.next().charAt(0);

System.out.print("Enter your second number: ");
second=scanner.nextDouble();

switch(operator){
case '+' -> System.out.println(first+" + "+second+" = "+(first+second));
case '-' -> System.out.println(first+" - "+second+" = "+(first-second));
case '*' -> System.out.println(first+" * "+second+" = "+(first*second));
case '/' -> System.out.println(first+" / "+second+" = "+(first/second));

}



}}