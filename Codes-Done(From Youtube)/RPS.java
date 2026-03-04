import java.util.*;
public class RPS{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Random random = new Random();

String intrested="";

String[] choices={"rock","paper","scissors"};

String guess;

do{

System.out.print("Enter rock/paper/scissors: ");
guess=scanner.nextLine().toLowerCase();



if(!guess.equals("scissors") && !guess.equals("rock") && !guess.equals("paper")){System.out.println("Invalid choice");continue;}

String computer=choices[random.nextInt(3)];
System.out.println("COMPUTER: "+computer);

if (guess.equals(computer)){System.out.println("TIE!");}
else if (guess.equals("rock") && computer.equals("scissors") || guess.equals("paper") && computer.equals("rock") || guess.equals("scissors") && computer.equals("paper") ){System.out.println("You WIN!!");}
else{System.out.println("You LOSE!!");}

System.out.println("Still Intrested? yes/no: ");
intrested = scanner.nextLine().toLowerCase();
}while(intrested.equals("yes"));

System.out.println("THANKYOU FOR PLAYING");
}}