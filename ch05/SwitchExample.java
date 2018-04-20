//Exercise 5-E.
//Exercise 5-F.

public class SwitchExample
{
    public static void main(String[] args)
    {
       lastNameWinner("Lazenby");
       System.out.println();
       dayOfWeek(7);
    }

    public static void lastNameWinner(String name)
    {
        switch(name)
        {
            case "Smith" : case "Jones" :
                System.out.println("Congratulations, Grand Winner.");
            break;

            case "Lazenby" :
            System.out.println("Hey, he owes me dinner!");
            break;

            default:
            System.out.println("Sorry, you are not a winner.");
        }
    }



    public static void dayOfWeek(int day)
    {
        switch(day)
        {
            case 1 :
                System.out.println("Sunday");
            break;

            case 2 :
                System.out.println("Monday");
            break;

            case 3 :
                System.out.println("Tuesday");
                break;

            case 4 :
                System.out.println("Wednesday");
                break;

            case 5 :
                System.out.println("Thursday");
                break;

            case 6 :
                System.out.println("Friday");
                break;

            case 7 :
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid entry:  " + day);
        }
    }

}
