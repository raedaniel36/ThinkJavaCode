//Exercise 2-B.

public class IntByZero
{
    public static void main (String[] args)
    {
        int var1 = 42;
//        int var2 = 0;
        int var2 = 2;
        int result = (var1 / var2);

        System.out.println("The result is:  " + result);
    }
}
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at IntByZero.main(IntByZero.java:7)