//Exercise 3-ES-1

public class Escape
{
    public static void main( String[] args)
    {
        String header = "\n\tNEW YORK 3-DAY FORECAST:\n";
        header += "\n\tDay\t\t\tHigh\tLow\t\tConditions\n";
        header += "\t---\t\t\t----\t---\t\t----------\n";

        String forecast = "\tSunday\t\t68F\t\t48F\t\tSunny\n";
        forecast += "\tMonday\t\t69F\t\t57F\t\tSunny\n";
        forecast += "\tTuesday\t\t71F\t\t50F\t\tCloudy\n";

        System.out.print(header + forecast);
    }
}
