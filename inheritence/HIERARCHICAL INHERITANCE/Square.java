class Shape {
    void draw() {
        System.out.println("Draw shape");
    }
}

class Circle extends Shape {
    void circle() {
        System.out.println("Circle shape");
    }
}

public class Square extends Shape {
    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
    }
}