public class RTO{
    public static void main(String[] args) {

         Profile a1 = new Profile( 19, "Car");
        Profile a2 = new Profile( 17, "Car");
        Profile a3 = new Profile(22, "Commercial Vehicle");
        Profile a4 = new Profile( 15, "Motorcycle");
        Profile a5 = new Profile( 21, "Truck");   // Invalid

        a1.check();
        a2.check();
        a3.check();
        a4.check();
        a5.check();
    }
}