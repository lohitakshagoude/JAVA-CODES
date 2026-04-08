class ResultData {
    private int marks;

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid Marks");
    }

    public int getMarks() {
        return marks;
    }

    public void displayResult() {
        if(marks >= 90)
            System.out.println("Grade: A");
        else if(marks >= 75)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

public class ResultEncapsulationSystem {
    public static void main(String[] args) {
        ResultData student = new ResultData();

        student.setMarks(91);
        System.out.println("Marks: " + student.getMarks());
        student.displayResult();
    }
}