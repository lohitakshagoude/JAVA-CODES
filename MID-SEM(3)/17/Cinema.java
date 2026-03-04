import java.util.*;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -------- Screen 1 Input --------
        System.out.print("Enter Movie Name for Screen 1: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter Show Time: ");
        String time1 = scanner.nextLine();

        System.out.print("Enter Total Seats: ");
        int seats1 = scanner.nextInt();
        scanner.nextLine();

        Screen screen1 = new Screen(name1, time1, 1, seats1);

        // -------- Screen 2 Input --------
        System.out.print("\nEnter Movie Name for Screen 2: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter Show Time: ");
        String time2 = scanner.nextLine();

        System.out.print("Enter Total Seats: ");
        int seats2 = scanner.nextInt();

        Screen screen2 = new Screen(name2, time2, 2, seats2);

        // -------- Booking --------
        System.out.print("\nTickets to book in Screen 1: ");
        int b1 = scanner.nextInt();
        screen1.bookTkt(b1);

        System.out.print("Tickets to book in Screen 2: ");
        int b2 = scanner.nextInt();
        screen2.bookTkt(b2);

        // -------- Cancellation --------
        System.out.print("Tickets to cancel in Screen 1: ");
        int c1 = scanner.nextInt();
        screen1.cancelTkt(c1);

        // -------- Final Details --------
        System.out.println("\nFinal Screening Details\n");

        screen1.details();
        screen2.details();
    }
}