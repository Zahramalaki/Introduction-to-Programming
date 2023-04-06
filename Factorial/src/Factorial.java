/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets a number and calculates the factorial of it.
 ***************************************************************************** */
import java.math.BigInteger;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number as n:");
        int n = input.nextInt();
        input.close();

        BigInteger result= BigInteger.valueOf(1);

        if (n<0) {
            System.out.println("Invalid");
        }
        else if (n==0) {
            System.out.println("Here is the factorial:");
            System.out.println(1);
        }
        else {
            while(n>0) {
                result = result.multiply(BigInteger.valueOf(n));
                n--;
            }
            System.out.println("Here is the factorial:");
            System.out.println(result);
        }

    }
}