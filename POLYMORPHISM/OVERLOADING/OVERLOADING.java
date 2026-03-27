class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    protected int add(int a, int b, int c)
    {
        return a + b + c;
    }

    private double add(double a, double b)
    {
        return a + b;
    }

    public void accessPrivate(double a, double b)
    {
        System.out.println("Sum of two decimal numbers: " + add(a, b));
    }

    public static void main(String[] args)
    {
        Calculator obj = new Calculator();

        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));

        obj.accessPrivate(2.5, 3.7);
    }
}