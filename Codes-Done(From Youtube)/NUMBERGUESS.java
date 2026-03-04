import java.util.*;
class NUMBERGUESS{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int guess;
int attempts=0;
int min=1;
int max=10;
int randomnumber=random.nextInt(min,max+1);

System.out.println("--------NUBER GUESSING GAME--------");
System.out.println("Guess a number between "+min+"-"+max);

do{
System.out.print("Enter your guess: ");
guess=scanner.nextInt();
attempts++;

if(guess<randomnumber){System.out.println("TOO LOW!");} 
else if(guess>randomnumber){System.out.println("TOO HIGH!");}
else if(guess==randomnumber){System.out.println("CORRECT"); System.out.println("No of attempts: "+attempts);}
}while(guess != randomnumber);
}}
