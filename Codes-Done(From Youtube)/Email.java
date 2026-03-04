import java.util.Scanner;
class Email{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String email;

System.out.println("Please enter your email:- ");
email=scanner.nextLine();

if (email.contains("@")){
String username=email.substring(0,email.indexOf("@"));
String domain=email.substring(email.indexOf("@")+1);
System.out.println("USERNAME: "+username);
System.out.println("DOMAIN: "+domain);
}
else{
System.out.println("YOUR EMAIL MUST CONTAIN @ SYMBOL");
}



}}


