import java.util.*;
public class SLOT{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int balance=100;
		int bet;
		int payout;
		String[] row;
		System.out.println("----------------------------------------");
		System.out .println("WELCOME TO GAMBLING");
		System.out.println("Symbols:  @  #  $  %  &");
		System.out.println("----------------------------------------");
		
		while(balance>0){
			System.out.println("Current Balance: "+balance);
			System.out.print("Enter your bet amount: ");
			bet=scanner.nextInt();
			scanner.nextLine();
			
			if (bet>balance){
				System.out.println("Insufficient Funds");
				continue;
			}
			else{
				balance-=bet;
			}
			row = spinRow();
			
			System.out.println("Spinning.....");
			
			for(String x:row){System.out.print(x+" | ");}
			System.out.println();
		}
		
		payout=getPayout(row, bet);
		if (payout>0){
			System.out.println("You won $" + payout);
			balance+=0;
		}
		else{System.out.println("You Lost,BLNT!!");}
		
		System.out.println("STILL INTRESTED? y/n");
		String intrest = scanner.nextLine().toLowerCase();
		
		
		System.out.println("THANKS FOR GAMBLING!!");
		
	}
	public  static String[] spinRow(){
		
		String[] symbols={"@","#","$","%","&" };
		
		String[] row= new String[3];
		Random random = new Random();
		
		for(int i=0;i<3;i++){
			row[i]=symbols[random.nextInt(symbols.length)];
		}
		return row;
		
	}
	public static int getPayout(String[] row,int bet){
		if(row[0].equals(row[1])&&row[1].equals(row[2])){
			return switch(row[0]){
				case "@" -> bet*2;
				case "#"  -> bet*3;
				case "$"  -> bet*5;
				case "%"-> bet*10;
				case "&" -> bet*20;
				default->0;
			};
		}
	return 0;}
	

}