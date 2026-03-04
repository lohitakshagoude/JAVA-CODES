import java.util.*;
public class DICE{
public static void main(String[] args){
Scanner scanner= new Scanner(System.in);
Random random= new Random();
int number;
int total=0;

System.out.print("Enter the no of dice: ");
number=scanner.nextInt();

if(number>0){
for(int i=0;i<number;i++){
int roll = random.nextInt(1,7);
dice(roll);
System.out.println("You rolled "+roll);
total+=roll;
}
System.out.println("Your total: "+total);
}
else{System.out.println("DICE CANT BE NEGETIVE");}
}
static void dice(int roll){
String dice1="ONE";
                
String dice2="TWO";
                
String dice3="THREE";
                
String dice4="FOUR";
                
String dice5="FIVE";
                
String dice6="SIX";
                
switch(roll){
case 1 -> System.out.println(dice1);
case 2 -> System.out.println(dice2);
case 3 -> System.out.println(dice3);
case 4 -> System.out.println(dice4);
case 5 -> System.out.println(dice5);
case 6 -> System.out.println(dice6);}
}
}