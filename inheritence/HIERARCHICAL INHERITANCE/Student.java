class Person {
    void info() {
        System.out.println("Person info");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher teaches");
    }
}

public class Student extends Person {
    public static void main(String[] args) {
        Student s = new Student();
        s.info();
    }
}