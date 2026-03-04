public class Fleet {
    public static void main(String[] args) {

        Bus bus = new Bus("KA01AB1234", "Diesel", 80, 50);
        Truck truck = new Truck("KA02CD5678", "Petrol", 100, 15.5);
        Van van = new Van("KA03EF9012", "Diesel", 90, true);

        bus.details();
        bus.start();
        bus.stop();
        System.out.println("----------------------");

        truck.details();
        truck.start();
        truck.stop();
        System.out.println("----------------------");

        van.details();
        van.start();
        van.stop();
    }
}