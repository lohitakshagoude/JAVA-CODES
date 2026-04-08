abstract class VehicleBase {
    abstract void start();
    abstract void stop();

    void fuelType() {
        System.out.println("Uses fuel or electricity");
    }
}

class ElectricCar extends VehicleBase {
    void start() {
        System.out.println("Electric Car Starts Silently");
    }

    void stop() {
        System.out.println("Electric Car Stops Smoothly");
    }
}

public class VehicleAbstractionSystem {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();
        car.start();
        car.stop();
        car.fuelType();
    }
}