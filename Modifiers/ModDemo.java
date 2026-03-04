public class ModDemo {
    public int a = 5;
    private int b = 10;

    public void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        ModDemo obj = new ModDemo();
        obj.show();
    }
}