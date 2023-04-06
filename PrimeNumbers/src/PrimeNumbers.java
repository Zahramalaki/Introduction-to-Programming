/* *******************************************************************************
 * Name: Zahra Malaki
 * Description: This program gets n as an integer number from user and prints the
 * n th prime number.
 ******************************************************************************* */
import java.util.*;

public class PrimeNumbers {
    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i=3; i<Math.sqrt(num)+1; i+=2) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int num = input.nextInt();
        int lastPrime = 0;
        int counter = 0;
        for (int i=2;counter<num;i++) {
            counter += ( isPrime(i)? 1 : 0 );
            lastPrime = i;
        }
        System.out.println(lastPrime);
    }
}