abstract class EmployeeBase {
    abstract void calculateSalary();

    void displayRole() {
        System.out.println("Employee Role Processing");
    }
}

class DeveloperRole extends EmployeeBase {
    void calculateSalary() {
        System.out.println("Salary Calculated for Developer");
    }
}

public class EmployeeAbstractionSystem {
    public static void main(String[] args) {
        DeveloperRole emp = new DeveloperRole();
        emp.calculateSalary();
        emp.displayRole();
    }
}