import java.util.*;
class METHOD{
public static void main(String[] args){

Scanner scanner= new Scanner(System.in);

System.out.println("Enter your age: ");
int age = scanner.nextInt();

if (ageCheck(age)){
System.out.println("YOU ARE ELIGIBLE TO VOTE!");}

else{
System.out.println("YOU ARE NOT ELIGIBLE TO VOTE!");}
}
static boolean ageCheck(int age){
if (age>18){
return true;}
else{
return false;}


}}