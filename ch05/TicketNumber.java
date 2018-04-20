//Exercise 5-H.

import java.util.Scanner;

public class TicketNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int ticketNumber;

        System.out.print("What is the Ticket Number?  ");
        ticketNumber = in.nextInt();
        System.out.println("This is the Ticket Number you entered:  " + ticketNumber);

        int ticketPrefix = ticketNumber / 10;
        int lastDigit = ticketNumber % 10;

        System.out.println("The Ticket Prefix is:  " + ticketPrefix);
        System.out.println("The last digit of the Ticket is:  " + lastDigit);

        boolean isValid = ((ticketPrefix % 7) == lastDigit);
        if (isValid)
        {
            System.out.println("This is a good number.");
        }
        else
        {
            System.out.println("This is a bad number.");
        }
    }
}
