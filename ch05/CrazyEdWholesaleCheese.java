//Exercise 5-G.

import java.util.Scanner;

public class CrazyEdWholesaleCheese
{
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);

            System.out.print("What size cheese would you like to order?  ");
            int cheeseSize = in.nextInt();
            switch(cheeseSize)
            {
                case 1 : case 2 : case 3 :
                System.out.println("You chose: " + cheeseSize + " inch diameter string cheese.");
                break;

                default :
                System.out.println("Please choose 1, 2, or 3 inch diameter string cheese.");
                return;
            }

            System.out.println("What length of cheese would you like to order?  ");
            int cheeseLength = in.nextInt();

            determineCostOfOrder(cheeseSize, cheeseLength);
        }

        public static void determineCostOfOrder(int cheeseSize, int cheeseLength)
        {
            final int COST_OF_1_INCH_CHEESE = 2;
            final int COST_OF_2_INCH_CHEESE = 4;
            final int COST_OF_3_INCH_CHEESE = 6;

            final int SHIPPING_COST_OF_1_INCH_CHEESE = 2;
            final int SHIPPING_COST_OF_2_INCH_CHEESE = 2;
            final int SHIPPING_COST_OF_3_INCH_CHEESE = 4;

            final int FREE_SHIPPING_BREAKPOINT_FOR_1_INCH_CHEESE = 50;
            final int FREE_SHIPPING_BREAKPOINT_FOR_2_INCH_CHEESE = 75;
            final int FREE_SHIPPING_BREAKPOINT_FOR_3_INCH_CHEESE = 25;

            final int HANDLING_CHARGE = 5;

            int cheeseCost = 0;
            int shippingCost = 0;

            boolean isValidOrder = true;

            if ((cheeseSize == 1) && (cheeseLength > FREE_SHIPPING_BREAKPOINT_FOR_1_INCH_CHEESE))
            {
                cheeseCost = (cheeseLength * COST_OF_1_INCH_CHEESE);
                shippingCost = 0;
            }
            else if (cheeseSize == 1)
            {
                cheeseCost = (cheeseLength * COST_OF_1_INCH_CHEESE);
                shippingCost = (cheeseLength * SHIPPING_COST_OF_1_INCH_CHEESE);
            }
            else if ((cheeseSize == 2) && (cheeseLength > FREE_SHIPPING_BREAKPOINT_FOR_2_INCH_CHEESE))
            {
                cheeseCost = (cheeseLength * COST_OF_2_INCH_CHEESE);
                shippingCost = 0;
            }
            else if (cheeseSize == 2)
            {
                cheeseCost = (cheeseLength * COST_OF_2_INCH_CHEESE);
                shippingCost = (cheeseLength * SHIPPING_COST_OF_2_INCH_CHEESE);
            }
            else if ((cheeseSize == 3) && (cheeseLength > FREE_SHIPPING_BREAKPOINT_FOR_3_INCH_CHEESE))
            {
                cheeseCost = (cheeseLength * COST_OF_3_INCH_CHEESE);
                shippingCost = 0;
            }
            else if (cheeseSize == 3)
            {
                cheeseCost = (cheeseLength * COST_OF_3_INCH_CHEESE);
                shippingCost = (cheeseLength * SHIPPING_COST_OF_3_INCH_CHEESE);
            }
            else
            {
                isValidOrder = false;
            }

            int totalCost = cheeseCost + shippingCost + HANDLING_CHARGE;

            if (isValidOrder)
            {
                System.out.println("The total cost of this cheese is:  $" + cheeseCost);
                System.out.println("The total shipping cost is:  $" + shippingCost);
                System.out.println("The Handling Charge for this order is:  $" + HANDLING_CHARGE);
                System.out.println("The total cost of this order is:  $" + totalCost);
                System.out.println();
            }
            else
            {
                System.out.println("This order is too crazy!");
            }
        }
    }
