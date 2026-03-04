public class Bus extends Vehicles {
    int passengerCapacity;

    Bus(String registrationNumber, String fuelType, int maxSpeed, int passengerCapacity) {
        super(registrationNumber, fuelType, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    void details() {
        System.out.println("Bus Registration: " + registrationNumber);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Route Capacity: " + passengerCapacity + " passengers");
    }
}