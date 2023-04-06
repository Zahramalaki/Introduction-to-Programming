/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets a number and prints the reversed form of it.
 ***************************************************************************** */
import java.util.*;
import static java.lang.Integer.parseInt;

public class NumberReversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number:");
        String x = input.nextLine();
        int num =parseInt(x);


        int reverse = 0;

        while( num > 0 ) {
            int mod = num % 10;
            reverse *= 10;
            reverse += mod;
            num /= 10;
        }
        System.out.println("Here is the reverse:");
        System.out.println(reverse);
    }
}