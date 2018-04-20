// Exercise 5-ES-1
// Exercise 2

public class Logic
{
    public static void main(String[] args)
    {
        boolean yes = true;
        boolean no = false;

        //Add these lines to test if both conditions are true.
        System.out.println("Both YesYes True:  " + ( yes && yes));
        System.out.println("Both YesNo True:  " + ( yes && no));

        System.out.println();

        //Add these lines to test if either condition is true.
        System.out.println("Either YesYes True:  " + ( yes || yes));
        System.out.println("Either YesNo True:  " + ( yes || no));
        System.out.println("Either NoNo True:  " + ( no || no));

        System.out.println();

        //Add two more lines to show an original and inverse value.
        System.out.println("Original Yes Value:  " + ( yes ));
        System.out.println("Inverse Yes Value:  " + ( !yes ));
    }
}
