class A {
    void a() {
        System.out.println("Method A");
    }
}

class B extends A {
    void b() {
        System.out.println("Method B");
    }
}

public class D extends B {
    void d() {
        System.out.println("Method D");
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.a();
        obj.b();
        obj.d();
    }
}