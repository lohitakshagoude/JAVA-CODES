public class Truck extends Vehicles {
    double cargoLimit;

    Truck(String registrationNumber, String fuelType, int maxSpeed, double cargoLimit) {
        super(registrationNumber, fuelType, maxSpeed);
        this.cargoLimit = cargoLimit;
    }

    void details() {
        System.out.println("Truck Registration: " + registrationNumber);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Load Capability: " + cargoLimit + " tons");
    }
}