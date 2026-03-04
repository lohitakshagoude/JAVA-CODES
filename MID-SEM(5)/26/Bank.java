public class Bank{

    public static void main(String[] args) {

        // Creating Savings Account
        Savings s1 = new Savings("Lohith",94848,90000.08);

        // Creating Current Account
        Current c1 = new Current("Vyshnav",387646,8300303.009);


        // Display initial statements
        System.out.println("---- Initial Statements ----");
        s1.dispStatement();
        c1.dispStatement();


        // Calculate Interest
        System.out.println("\n---- Calculating Interest ----");
        s1.calcIntrest();
        c1.calcIntrest();


        // Deposit & Withdraw
        s1.deposit(2000);
        c1.withdraw(3000);


        // Display final statements
        System.out.println("\n---- Final Statements ----");
        s1.dispStatement();
        c1.dispStatement();


        // Showing bank-wide interest rate
        System.out.println("\nBank Interest Rate: "
                + Platinum.Wildintrest + "%");
    }
}