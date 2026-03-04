public class Van extends Vehicles{
    boolean refrigeration;

    Van(String registrationNumber, String fuelType, int maxSpeed, boolean refrigeration) {
        super(registrationNumber, fuelType, maxSpeed);
        this.refrigeration = refrigeration;
    }

    void details() {
        System.out.println("Van Registration: " + registrationNumber);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Refrigeration Support: " + refrigeration);
    }
}