public class SetterDemo {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public void show() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        SetterDemo obj = new SetterDemo();
        obj.setAge(21);
        obj.show();
    }
}