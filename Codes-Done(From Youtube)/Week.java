import java.util.*;
class Week{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a day: ");
String day = scanner.nextLine().toUpperCase();

switch(day){
case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" -> 
System.out.println("ITS A WEEK DAY");
case "SATURDAY", "SUNDAY" -> System.out.println("ITS THE WEEKEND!!");}


}}