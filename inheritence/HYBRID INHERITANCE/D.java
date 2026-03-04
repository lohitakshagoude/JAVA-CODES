class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

class C extends A {
    void showC() {
        System.out.println("Class C");
    }
}

public class D extends B {
    public static void main(String[] args) {
        D obj = new D();
        obj.showA();
        obj.showB();
    }
}