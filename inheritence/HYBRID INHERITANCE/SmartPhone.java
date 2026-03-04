class Device {
    void power() {
        System.out.println("Device powered");
    }
}

class Phone extends Device {
    void call() {
        System.out.println("Making call");
    }
}

public class SmartPhone extends Phone {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.power();
        s.call();
    }
}