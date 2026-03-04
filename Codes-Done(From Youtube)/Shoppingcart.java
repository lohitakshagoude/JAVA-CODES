import java.util.Scanner;
class Shoppingcart{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String item;
int quantity;
double price;
double total;

System.out.print("Which item would you like to buy:- ");
item = scanner.nextLine();
System.out.print("How many of them you would like to buy:- ");
quantity = scanner.nextInt();
System.out.print("What is the price for 1 item:- ");
price = scanner.nextDouble();

total=price*quantity;

System.out.println("You've bought "+quantity+" "+item+"/s");
System.out.println("Your total is "+total);



}
}