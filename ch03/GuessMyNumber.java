//Exercise 3-4.

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber
{
    public static void main(String[] args)
    {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        // printing this so I can check the code
        System.out.println(number);

        // prompt the user and get the value
        int guess;
        Scanner in = new Scanner(System.in);

        System.out.print("Choose a number:  ");
        guess = in.nextInt();
        int difference = number - guess;
        System.out.println("You chose: " + guess);
        System.out.println("The number I chose was: " + number);
        System.out.println("You were off by: " + difference);
    }

}

