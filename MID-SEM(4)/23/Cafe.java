import java.util.*;

public class Cafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int category;
        int quantity;
        double price = 0;
        double total;
        double discount = 0;
        double finalAmount;

        System.out.println("---- TasteBud Café Menu ----");
        System.out.println("1. Beverages  - ₹100");
        System.out.println("2. Starters   - ₹200");
        System.out.println("3. Main Course- ₹400");
        System.out.println("4. Desserts   - ₹150");
        System.out.println("5. Combo Meals- ₹600");

        System.out.print("\nEnter Category Number (1-5): ");
        category = sc.nextInt();
        // Switch for category selection
        switch (category) {
            case 1:
                price = 100;
                break;
            case 2:
                price = 200;
                break;
            case 3:
                price = 400;
                break;
            case 4:
                price = 150;
                break;
            case 5:
                price = 600;
                break;
            default:
                System.out.println("Invalid selection");
                return;   // stops program
        }

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        total = price * quantity;

        // Discount logic
        if (total > 2000) {
            discount = 0.20 * total;
        }
        else if (total > 1000) {
            discount = 0.10 * total;
        }

        finalAmount = total - discount;

        // Final Bill
        System.out.println("\n------ Final Bill ------");
        System.out.println("Category Selected: " + category);
        System.out.println("Price per Item: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }
}