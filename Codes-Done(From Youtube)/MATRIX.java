import java.util.*;
class MATRIX{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int rows;
int coloumns;
char symbol;

System.out.print("Enter the no of rows:" );
rows=scanner.nextInt();

System.out.print("Enter the Symbol:" );
symbol=scanner.next();

System.out.print("Enter the no of coloumns:" );
coloumns=scanner.nextInt();



for(int i=1 ; i<=rows ; i++ ){
for(int j=1 ; j<=coloumns ; j++){
System.out.print(symbol);}
System.out.println();}
}}