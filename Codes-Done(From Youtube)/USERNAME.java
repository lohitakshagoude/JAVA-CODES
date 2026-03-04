import java.util.*;

class USERNAME{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your username: ");
String un = scanner.nextLine();

if (un.length()>12 || un.length()<4 ){
System.out.println("USERNAME SHOULD BE WITH IN 4-12 CHARACTERS!");}

else if (un.contains(" ") || un.contains("_")){
System.out.println("USER NAME CANNOT CONTAIN ANY SPACES OR UNDERSCORES!");}

else{
System.out.println("HELLO "+un+"!");
}
}}