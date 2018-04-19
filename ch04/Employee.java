//Exercise 4-H.

import java.util.Scanner;
import java.util.Random;

public class Employee
{
    public static void main(String[] args)
    {
        int birthYear = 1995;
        boolean isUnionMember = false;
        String firstName = "Robin";
        String middleName = "Ann";
        String lastName = "Daniel";
        int employeeNumber;

        printHeader();

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your 5 digit employee number:  ");
        employeeNumber = in.nextInt();

        printFullName(lastName, firstName, middleName);
        printUnionStatus(isUnionMember);
        printAge(birthYear);
        printEvenOrOdd(employeeNumber);
        printGenerateSecretPassword(employeeNumber);
    }

    private static void printHeader()
    {
        String header = "Welcome to the WallabyTech Employee Application\n";
        header += "-----------------------------------------------\n";
        System.out.print(header);
    }

    private static void printFullName(String ln, String fn, String mn)
    {
        System.out.println(ln + ", " + fn + " " + mn);
    }

    private static void printUnionStatus(boolean s)
    {
        System.out.println("Your union status is:  " + s);
    }

    private static void printAge(int a)
    {
        final int CURRENT_YEAR = 2018;
        int age = CURRENT_YEAR - a;
        System.out.println("Your age is:  " + age);
    }

    private static void printEvenOrOdd(int n)
    {
        int typeOfNumber = (n % 2);
        System.out.println("Employee Number is even (0) or odd (1): " + typeOfNumber);
    }

    private static void printGenerateSecretPassword(int n)
    {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        int password = ((n + number) * 5);
//        System.out.println(number); //Did this to check the computation.
        System.out.println("Employee's random secret ps is: " + password);
    }
}
