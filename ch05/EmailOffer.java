//Exercise 5-J.

public class EmailOffer
{
    public static void main(String[] args)
    {
        determineEmailOffer("IA", 10);
    }

    public static void determineEmailOffer(String state, int currentSpeed)
    {
        if ((state.equals("IA")) && (currentSpeed < 30))
        {
            System.out.println("Congratulations!  You are eligible for a free HSI upgrade to 50M.");
        }
        else if ((state.equals("MO")) && (currentSpeed < 10))
        {
            System.out.println("Congratulations!  You are eligible for a free HSI upgrade to 20M.");
        }
        else if ((state.equals("MO")) && (currentSpeed < 25))
        {
            System.out.println("Congratulations!  You are eligible for a free HSI upgrade to 50M.");
        }
        else
        {
            System.out.println("We are sorry.  No HSI Upgrade is available at this time.");
        }
    }
}
