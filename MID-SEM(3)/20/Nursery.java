public class Nursery {

    public static void main(String[] args) {

        // Create 3 plants
        Plant p1 = new Plant("P101", "Rose", "Outdoor", 150.0, 20);
        Plant p2 = new Plant("P102", "Snake Plant", "Indoor", 300.0, 10);
        Plant p3 = new Plant("P103", "Tulip", "Outdoor", 200.0, 15);

        System.out.println("Initial Inventory:");
        p1.details();
        p2.details();
        p3.details();

        System.out.println("\nCustomer buys 5 Roses:");
        p1.sell(5);
        p1.details();

        System.out.println("\nCustomer tries to buy 20 Snake Plants:");
        p2.sell(20);   // exceeds stock
        p2.details();

        System.out.println("\nRestocking 10 Snake Plants:");
        p2.restock(10);
        p2.details();
    }
}