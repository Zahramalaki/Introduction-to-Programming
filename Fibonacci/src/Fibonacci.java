/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets a number and determines whether it is a member
 * of fibonacci series or not. Note that a positive integer is a Fibonacci number
 * if one of the following expressions is a square number:
 * 5*n^2 + 4
 * 5*n^2 - 4
 ***************************************************************************** */
import java.util.*;
public class Fibonacci {

    public static boolean isSquareNumber(long n) {
        boolean Ok = false;
        long a=2 , counter=0;
        if      (n<1)   return false;
        if      (n==1)  return true;
        else {
            while (n>1) {
                while (n%a==0) {
                    n/=a;
                    counter++;
                }
                if (counter>0) {
                    if (counter%2==0) Ok=true;
                    else Ok = false;
                    counter=0 ;
                }
                a++;
            }
        }
        return Ok;

    }

    public static boolean isFibo(long n) {

        long b1 = (long) (5*Math.pow(n,2) + 4);
        long b2 = (long) (5*Math.pow(n,2) - 4);

        return isSquareNumber(b1) || isSquareNumber(b2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Please enter n :");
            long n = input.nextInt();
            System.out.println( n + " is a fibonacci number : " + isFibo(n) );

            System.out.println("\nDo you want to run again? answer with y or n");
            String d = input.next();
            if (d.toLowerCase().startsWith("n")) { System.out.println("Finished!");break;}
        }

    }
}