public class MethodAccess {
    public void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        MethodAccess obj = new MethodAccess();
        obj.greet();
    }
}