import java.util.*;
public class QUIZ{
public static void main(String[] args){
Scanner scanner= new Scanner(System.in);

String[] questions={"1.Who is the goat in F1?",
                    "2.What is the engine used in Bugatti Tourbillon?",
                    "3.Which company owns Rolls-Royce?",
                    "4.Who is the best Dictator from the past?",
                    "5.What is the new meme in 2026?"};
String[][] options={
{"1.Oscar Piastri","2.Charles Leclerc","3.Max Verstappen","4.Lewis Hamilton"},
{"1.V-12","2.V-16","3.W-16","4.X-16"},
{"1.BMW","2.BENZ","3.WOLKSWAGEN","4.FERRARI"},
{"1.STALIN","2.HITLER","3.NEPOLEAN","4.PUTIN"},
{"1.CITY BOY","2.67","3.AI BABY","4.KIRKIFICATION"}};

int[] answers={3,3,1,2,1};
int guess;
int score=0;
System.out.println("-------------QUIZ-------------");
for(int i=0;i<questions.length;i++){System.out.println(questions[i]);
for(String option: options[i]){System.out.println(option);}

System.out.print("Enter your Guess: ");
guess=scanner.nextInt();

if(guess==answers[i]){System.out.println("CORRECT");
score++;}

else{System.out.println("WRONG");}
System.out.println("--------------------------------");


}

System.out.println("Your score: "+score+"/"+questions.length);

}
}