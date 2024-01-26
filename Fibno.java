//Java Program to print Fibonacci series
import java.util.*;
// The line `public class Fibno` is declaring a public class named `Fibno`. This class is used to
// define the main logic of the program.
public class Fibno
{
    public static void main(String[] args) 
    {
        //Take input from the user
        //Create instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        // `int t1 = 0, t2 = 1;` is declaring and initializing two variables `t1` and `t2` with initial
        // values of 0 and 1 respectively. These variables are used to store the previous two terms of
        // the Fibonacci series.
        int t1 = 0, t2 = 1;
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();   //Declare and Initialize the number of terms
        System.out.println("First " + n + " terms of fibonnaci series: ");
        //Print the fibonacci series
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}