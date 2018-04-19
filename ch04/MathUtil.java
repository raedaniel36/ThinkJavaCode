//Exercise 4-F.

public class MathUtil
{
    public static void main(String[] args)
    {
        printDifference(-4, 5);
        printAbsValue(-45);
        printDifference(1000, 4000000);
    }

    private static void printDifference(int a, int b)
    {
        int difference = a - b;
        System.out.println("The values of a and b are:  " + a + " and " + b);
        System.out.println("This difference between a and b is:  " + difference);
        System.out.println();
        printAbsValue(difference);
    }

    private static void printAbsValue(int c)
    {
        int absoluteValue = Math.abs(c);
        System.out.println("The value of c is:  " + c);
        System.out.println("The absolute value of c is:  " + absoluteValue);
        System.out.println();
    }
}
