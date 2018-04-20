// Exercise 5-ES-1
// Exercise 5

public class If
{
    public static void main(String[] args)
    {
        if (5>1)
        {
            System.out.println("Five is greater than one.");
        }

        System.out.println();

        if (2<4)
        {
            System.out.println("Two is less than four.");
            System.out.println("Test succeeded.");
        }

        System.out.println();

        int num = 15;
        if (((num > 5) && (num < 10)) || (num == 12))
        {
            System.out.println("Number is 6-9 inclusive, or 12");
        }
    }
}
