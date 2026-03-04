class A {
    void a() {
        System.out.println("A method");
    }
}

class B extends A {
    void b() {
        System.out.println("B method");
    }
}

class C extends A {
    void c() {
        System.out.println("C method");
    }
}

public class E extends B {
    public static void main(String[] args) {
        E obj = new E();
        obj.a();
        obj.b();
    }
}