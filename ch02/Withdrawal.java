//Exercise 2-D.

public class Withdrawal
{
    public static void main (String[] args)
    {
        int withdrawal = 2;
        int var20 = withdrawal / 20;
        int left20 = withdrawal % 20;
        int var10 = left20 / 10;
        int left10 = left20 % 10;
        int var05 = left10 / 5;
        int var01 = left10 % 5;

        System.out.println("The amount of the withdrawal is:  " + withdrawal);
        System.out.println("The number of $20s dispensed is:  "  + var20);
//        System.out.println(left20);
        System.out.println("The number of $10s dispensed is:  " + var10);
//        System.out.println(left10);
        System.out.println("The number of $5s dispensed is:  " + var05);
        System.out.println("The number of $1s dispensed is:  " + var01);
    }
}
