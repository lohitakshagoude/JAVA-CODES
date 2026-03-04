class Parent {
    protected void message() {
        System.out.println("Protected method");
    }
}

public class Child extends Parent {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.message();
    }
}