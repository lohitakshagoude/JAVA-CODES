class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

public class Puppy extends Dog {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
    }
}