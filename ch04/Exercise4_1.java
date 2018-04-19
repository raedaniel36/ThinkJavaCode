//Exercise 4-1.

public class Exercise4_1
{
    public static void zoop()
    {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args)
    {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle()
    {
        System.out.print("wug");
        ping();
    }

    public static void ping()
    {
        System.out.println(".");
//        baffle();  <= Causes an endless loop.
    }
}
//No, I wug. (new line)
//You wugga wug. (new line)
//I wug.

//invoke baffle() at the end of ping()
//No, I wug.
//wug.   Endless loop of "wug."