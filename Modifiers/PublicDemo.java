public class PublicDemo {
    public int x = 10;

    public void show() {
        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();
        obj.show();
    }
}