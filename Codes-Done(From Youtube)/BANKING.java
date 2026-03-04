import java.util.*;
class BANKING{
static Scanner scanner = new Scanner(System.in);

public static void main(String[] args){
double balance=0;
int choice;
boolean isNigger=true;

while(isNigger){
System.out.println("***********************");
System.out.println("Welcome to NIGGER Bank");
System.out.println("***********************");
System.out.println("1.Check yall god damn Balance");
System.out.println("2.Deposit some motherfuckin Money");
System.out.println("3.Withdraw Some SHIT coins");
System.out.println("4.GET the fuck of the BANK");
System.out.println("Enter: ");
choice=scanner.nextInt();

switch(choice){

case 1 -> showBalance(balance);
case 2 -> balance+=deposit();
case 3 -> balance-=withdraw();
case 4 -> isNigger=false;}
System.out.println("THANKYOU FOR LEAVING OUR BITCH ASS BANK");
}}

static void showBalance(double balance){System.out.println("$"+balance);}

static  double deposit(double amount){
System.out.print("Enter the amount to deposit:" );
double amount = scanner.nextDouble();
if (amount<0){System.out.println("Seriosly Nigga negetive money?");}
else{return amount;}
}

static  double withdraw(double money){
System.out.print("Enter the amount to withdraw:" );
double money = scanner.nextDouble();
if(money>balance){System.out.println("Nigga you aint got that much money");}
else if (money<0){System.out.println("Seriosly Nigga negetive money?");}
else{return money;}
}

}
