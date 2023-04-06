/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program is for an ATM that gets a number for the amount of
 * money, and gives that amount of money with a minimum number of bills.
 ***************************************************************************** */
import java.util.*;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of money:");
        int x = input.nextInt();

        int temp= x/50;
        System.out.println("50T: "+ temp);

        int temp1= x % 50;
        int temp2= temp1/10;
        System.out.println("10T: "+ temp2);

        int temp3= temp1 % 10;
        int temp4= temp3/5;
        System.out.println("5T: "+ temp4);

        int temp5= temp3 % 5;
        int temp6= temp5/2;
        System.out.println("2T: "+ temp6);

        int temp7= temp5 % 2;
        int temp8= temp7/1;
        System.out.println("1T: "+ temp8);

    }
}