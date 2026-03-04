public class Vehicles {
    String registrationNumber;
    String fuelType;
    int maxSpeed;

    Vehicles(String registrationNumber, String fuelType, int maxSpeed) {
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }

    void start() {
        System.out.println("Vehicle Started");
    }

    void stop() {
        System.out.println("Vehicle Stopped");
    }

    void details() { }
}