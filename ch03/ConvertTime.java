//Exercise 3-3.

import java.util.Scanner;

public class ConvertTime
{
    public static void main(String[] args)
    {
        int inputSeconds;

        int numberHours;
        int numberMinutes;
        int numberSeconds;

        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("What is the number of seconds? ");
        inputSeconds = in.nextInt();

        // convert and output the result
        numberSeconds = inputSeconds % 60;
        System.out.println(numberSeconds);

        numberMinutes = ((inputSeconds - numberSeconds) / 60) % 60;
        System.out.println(numberMinutes);

        numberHours = ((inputSeconds - numberSeconds) / 60) / 60;
        System.out.println(numberHours);

        System.out.println(inputSeconds + " seconds = " + numberHours + " hours, " + numberMinutes + " minutes, " + numberSeconds + " seconds");
    }
}

