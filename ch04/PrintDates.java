//Exercise 4-3.

public class PrintDates
{
    public static void main(String[] args)
    {
        String day = "Wednesday";
        int date = 18;
        String month = "April";
        int year = 2018;

        printAmerican(day, date, month, year);
        System.out.println();
        printEuropean(day, date, month, year);
    }

    public static void printAmerican(String day, int date, String month, int year)
    {
        System.out.println("American format:");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);
    }

    public static void printEuropean(String day, int date, String month, int year)
    {
        System.out.println("European format:");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.println(year);
    }
}
