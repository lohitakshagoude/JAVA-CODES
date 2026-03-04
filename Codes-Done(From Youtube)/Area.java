import java.util.Scanner;
class Area{
public static void main(String[] args){
int width=0;
int length=0;
int area=0;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the width of your Rectangle: ");
width = scanner.nextInt();
System.out.print("Enter the length of your Rectangle: ");
length = scanner.nextInt();

area=width*length;
System.out.print("The area of your Rectangle is: "+area);}}

