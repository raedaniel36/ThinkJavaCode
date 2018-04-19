//Exercise 4-G.

public class BegMethodSignature
{
    public static void main(String[] args)
    {
        printSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printSum(5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
    }

    private static void printSum(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j)
    {
        int sum = a + b + c + d + e + f + g + h + i + j;
        System.out.println("The values of a through j are:  " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h + ", " + i + ", " + j);
        System.out.println("This sum of a through j is:  " + sum);
        System.out.println();
    }
}
