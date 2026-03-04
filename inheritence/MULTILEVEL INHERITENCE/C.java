class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B");
    }
}

public class C extends B {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}