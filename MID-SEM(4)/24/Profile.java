import java.util.*;

public class Profile{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 6;
        String name;
        int marks;

        // Counters for each grade
        int outstanding = 0;
        int excellent = 0;
        int good = 0;
        int satisfactory = 0;
        int needsImprovement = 0;

        int totalMarks = 0;

        for (int i = 1; i <= students; i++) {

            System.out.println("\nEnter details for Student " + i);

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Marks (out of 100): ");
            marks = sc.nextInt();
            sc.nextLine();   // consume newline

            totalMarks += marks;

            System.out.print("Grade: ");

            if (marks == 100) {
                System.out.println("Outstanding (Perfect Scorer)");
                outstanding++;
            }
            else if (marks >= 90) {
                System.out.println("Outstanding");
                outstanding++;
            }
            else if (marks >= 75) {
                System.out.println("Excellent");
                excellent++;
            }
            else if (marks >= 60) {
                System.out.println("Good");
                good++;
            }
            else if (marks >= 45) {
                System.out.println("Satisfactory");
                satisfactory++;
            }
            else {
                System.out.println("Needs Improvement");
                needsImprovement++;
            }
        }

        // Class Average
        double average = (double) totalMarks / students;

        // Summary
        System.out.println("\n------ Grade Summary ------");
        System.out.println("Outstanding: " + outstanding);
        System.out.println("Excellent: " + excellent);
        System.out.println("Good: " + good);
        System.out.println("Satisfactory: " + satisfactory);
        System.out.println("Needs Improvement: " + needsImprovement);

        System.out.println("\nClass Average: " + average);
    }
}
	
	