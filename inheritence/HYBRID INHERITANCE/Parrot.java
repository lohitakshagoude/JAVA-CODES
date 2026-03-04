class Animal {
    void eat() {
        System.out.println("Animal eating");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird flying");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Fish swimming");
    }
}

public class Parrot extends Bird {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat();
        p.fly();
    }
}