import java.util.*;
class Temp{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
double temp;
double newtemp;
String choice;

System.out.println("TEMPARATURE CONVERSION PROGRAM");

System.out.print("Enter your Temparature: ");
temp=scanner.nextDouble();

System.out.print("CELCIUS (C) OR FARENHEIT (F): ");
choice=scanner.nextLine().toUpperCase();

newtemp= (choice.equals("C"))? (temp-32)*5/9 : (temp*5/9)+32;

System.out.println(newtemp);

}}