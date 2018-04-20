//Exercise 5-I.

public class GreenCoffeeGrowersDiscount
{
    public static void main(String[] args)
    {
        determineDiscount("Bicycle", 50);
    }

    public static void determineDiscount(String modeOfTravel, int distanceOfCommute)
    {
        if (distanceOfCommute < 21)
        {
            System.out.println("Congratulations!  You are eligible for a Free Coffee and a 30% Discount.");
        }
        else if ((modeOfTravel.equals("Bicycle")) && (distanceOfCommute > 20 && distanceOfCommute < 30))
        {
            System.out.println("Congratulations!  You are eligible for a 30% Discount.");
        }
        else if ((modeOfTravel.equals("Bicycle")) && (distanceOfCommute > 29 && distanceOfCommute < 50))
        {
            System.out.println("Congratulations!  You are eligible for a 20% Discount.");
        }
        else if ((modeOfTravel.equals("Bus")) && (distanceOfCommute > 34 && distanceOfCommute < 50))
        {
            System.out.println("Congratulations!  You are eligible for a 50% Discount.");
        }
        else
        {
            System.out.println("We are sorry.  You are not eligible for a discount at this time.");
        }
    }
}
