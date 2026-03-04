class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Cat extends Animal {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}