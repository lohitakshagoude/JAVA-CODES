public class GetterDemo {
    private int data = 50;

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        GetterDemo obj = new GetterDemo();
        System.out.println(obj.getData());
    }
}