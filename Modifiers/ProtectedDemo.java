class ProtectedDemo {
    protected int value = 30;

    protected void show() {
        System.out.println("Value: " + value);
    }
}

public class TestProtected extends ProtectedDemo {
    public static void main(String[] args) {
        TestProtected obj = new TestProtected();
        obj.show();
    }
}