class DefaultDemo {
    int num = 40;

    void show() {
        System.out.println("Number: " + num);
    }
}

public class TestDefault {
    public static void main(String[] args) {
        DefaultDemo obj = new DefaultDemo();
        obj.show();
    }
}