//Exercises 5-A through 5-D.

public class LogicMethods
{
    public static void main(String[] args)
    {
        //Exercise 5-A.
        printIsLarge(4);
        //Exercise 5-B.
        printIsLargeOrSmall(47);
        //Exercise 5-C.
        printLargest(25, 9);
        //Exercise 5-D
        printLargestOdd(12, 12);
    }

    public static void printIsLarge(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large.");
        }
    }

    public static void printIsLargeOrSmall(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large.");
        }
        else if (number < 10)
        {
            System.out.println("The number is small.");
        }
    }

    public static void printLargest(int number1, int number2)
    {
        if (number1 == number2)
        {
            System.out.println("The numbers are equal.");
        }
        else if (number1 > number2)
        {
            System.out.println("The largest number is:  " + number1);
        }
        else
        {
            System.out.println("The largest number is:  " + number2);
        }
    }

    public static void printLargestOdd(int x, int y)
    {
        boolean xIsOdd = (x % 2 == 1);
        boolean xIsEven = (x % 2 == 0);
        boolean yIsOdd = (y % 2 == 1);
        boolean yIsEven = (y % 2 == 0);

        if ((xIsEven) && (yIsEven))
        {
            System.out.println("Neither number is ODD.");
        }
        else if ((xIsEven) && (yIsOdd))
        {
            System.out.println("The largest ODD number is:  " + y);
        }
        else if ((xIsOdd) && (yIsEven))
        {
            System.out.println("The largest ODD number is:  " + x);
        }
        else if ((x == y) && (xIsOdd))
        {
            System.out.println("Two ODDs make an EVEN:  " + (x + y));
        }
        else if (x > y)
        {
            System.out.println("The largest ODD number is:  " + x);
        }
        else if (y > x)
        {
            System.out.println("The largest ODD number is:  " + y);
        }
    }
}

