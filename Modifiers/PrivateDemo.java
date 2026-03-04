public class PrivateDemo {
    private int num = 20;

    private void display() {
        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {
        PrivateDemo obj = new PrivateDemo();
        obj.display();
    }
}