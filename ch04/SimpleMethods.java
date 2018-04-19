// Exercise 4-A.

public class SimpleMethods
{
    public static void main(String[] args)
    {
        printCount(5);
        printSum(4, 6);
        printSum(7, 2);
        printBoolean(true);
        printBoolean(false);
    }

    private static void printCount(int count)
    {
        System.out.println("This count is:  " + count);
    }

    private static void printSum(int x, int y)
    {
        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }

    private static void printBoolean(boolean isRich)
    {
        System.out.println("I am rich:  " + isRich);
    }
}


