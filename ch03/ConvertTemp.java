//Exercise 3-2.

import java.util.Scanner;

public class ConvertTemp {

    public static void main(String[] args)
    {
        double tempCelsius;
        double tempFahrenheit;
        Scanner in = new Scanner(System.in);


        // prompt the user and get the value
        System.out.print("What is the Celsius temperature? ");
        tempCelsius = in.nextDouble();

        // convert and output the result
        tempFahrenheit = ((tempCelsius * (9.0 / 5.0)) + 32.0);
        System.out.println(tempCelsius);
        System.out.println(tempFahrenheit);
        System.out.printf("%.1f C = %.1f F\n", tempCelsius, tempFahrenheit);
    }
}

