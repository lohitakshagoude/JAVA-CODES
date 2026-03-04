import java.util.*;

public class Sim{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("\nEnter details for Customer " + i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Number of Calls: ");
            int calls = sc.nextInt();

            System.out.print("Number of SMS: ");
            int sms = sc.nextInt();

            System.out.print("Data Used (GB): ");
            double data = sc.nextDouble();
            sc.nextLine(); // consume newline

            // ----- Call Charges -----
            double callCharge = 0;

            if (calls <= 50) {
                callCharge = 0;
            }
            else if (calls <= 150) {
                callCharge = (calls - 50) * 1.0;
            }
            else {
                callCharge = (100 * 1.0) + ((calls - 150) * 1.5);
            }

            // ----- SMS Charges -----
            double smsCharge = 0;

            if (sms <= 100) {
                smsCharge = sms * 0.5;
            }
            else {
                smsCharge = 100 * 0.5;   // beyond 100 free
            }

            // ----- Data Charges -----
            double dataCharge = 0;

            if (data <= 1) {
                dataCharge = 0;
            }
            else if (data <= 5) {
                dataCharge = (data - 1) * 50;
            }
            else {
                dataCharge = (4 * 50) + ((data - 5) * 30);
            }

            // ----- Total Bill -----
            double total = callCharge + smsCharge + dataCharge;

            double tax = 0;
            if (total > 500) {
                tax = total * 0.18;
            }

            double finalAmount = total + tax;

            // ----- Itemized Bill -----
            System.out.println("\n------ Itemized Bill ------");
            System.out.println("Customer Name: " + name);
            System.out.println("Call Charges: ₹" + callCharge);
            System.out.println("SMS Charges: ₹" + smsCharge);
            System.out.println("Data Charges: ₹" + dataCharge);
            System.out.println("Subtotal: ₹" + total);
            System.out.println("Service Tax (18% if applicable): ₹" + tax);
            System.out.println("Final Payable Amount: ₹" + finalAmount);
            System.out.println("--------------------------------------");
        }
    }
}