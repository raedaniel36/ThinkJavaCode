//Exercise 4-E.

public class DemoMath
{
    public static void main(String[] args)
    {
        int a = -4;
        int b = 5;

        System.out.println("The value of a is:  " + a);
        System.out.println("The absolute value of a is:  " + Math.abs(a));
        System.out.println();

        System.out.println("The value of a is:  " + a);
        System.out.println("The value of b is:  " + b);
        System.out.println("The max value of a and b is:  " + Math.max(a, b));
        System.out.println();

        double c = 6.0;
        System.out.println("The value of c is:  " + c);
        System.out.println("The value of c to the power of c is:  " + Math.pow(c, c));
        System.out.println();

        System.out.println("The valued of PI is:  " + Math.PI);
    }
}
