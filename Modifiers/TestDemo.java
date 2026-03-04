class Demo {
    void display() {
        System.out.println("Default method");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}