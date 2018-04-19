//Exercise 2-3.

public class Time
{
    public static void main (String[] args)
    {
        int hour = 22;
        int minute = 49;
        int second = 45;

        final int NUM_SEC_IN_DAY = 86400;

        System.out.print("The number of seconds since midnight is:  ");
        System.out.println((((hour * 60) + minute) * 60) + second); //82,185

        System.out.println();

        System.out.print("The number of seconds remaining in the day is:  ");
        System.out.println( NUM_SEC_IN_DAY - ((((hour * 60) + minute) * 60) + second));

        System.out.println();

        double hour2 = 22.0;
        double maxhr2 = 24.0;
        System.out.println("Fraction of the day that has passed: ");
        System.out.println(hour2 / maxhr2);

        System.out.println();

        double oldhour = 22.0;
        double oldmin = 49.0;
        double oldsec = 45.0;

        double newhour = 23.0;
        double newmin = 12.0;
        double newsec = 35.0;

        double oldtime = ((((oldhour * 60) + oldmin) * 60) + oldsec);
        double newtime = ((((newhour * 60) + newmin) * 60) + newsec);
        double elapsedtime = newtime - oldtime;

        System.out.print("Elapsed time in seconds is: ");
        System.out.println(elapsedtime);

        System.out.print("Elapsed time in minutes is: ");
        System.out.println(elapsedtime / 60);

        System.out.print("Elapsed time in hours is: ");
        System.out.println((elapsedtime / 60) / 60);




    }
}
