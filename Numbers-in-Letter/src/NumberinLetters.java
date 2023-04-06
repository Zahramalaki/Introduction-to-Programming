/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets a number between -99 and 99 and prints it in
 * letters.
 ***************************************************************************** */
import java.util.*;

public class NumberinLetters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between -99 and 99:");
        int n = input.nextInt();

        if (n<0 && n>=-99) {
            System.out.print("minus ");
        }
        if (n==0) {
            System.out.print("zero");
        }

        int N=Math.abs(n);

        if (N>=10 && N<=19) {

            if (N==10) {
                System.out.print("ten");
            }
            if (N==11) {
                System.out.print("eleven");
            }
            if (N==12) {
                System.out.print("twelve");
            }
            if (N==13) {
                System.out.print("thirteen");
            }
            if (N==14) {
                System.out.print("fourteen");
            }
            if (N==15) {
                System.out.print("fifteen");
            }
            if (N==16) {
                System.out.print("sixteen");
            }
            if (N==17) {
                System.out.print("seventeen");
            }
            if (N==18) {
                System.out.print("eighteen");
            }
            if (N==19) {
                System.out.print("nineteen");
            }
        }

        else {

            int tens=N/10;

            if (tens==2) {
                System.out.print("twenty");
            }
            if (tens==3) {
                System.out.print("thirty");
            }
            if (tens==4) {
                System.out.print("forty");
            }
            if (tens==5) {
                System.out.print("fifty");
            }
            if (tens==6) {
                System.out.print("sixty");
            }
            if (tens==7) {
                System.out.print("seventy");
            }
            if (tens==8) {
                System.out.print("eighty");
            }
            if (tens==9) {
                System.out.print("ninety");
            }
            int ones=N%10;

            if (ones!=0 && tens!=0 ){
                System.out.print("-");
            }
            if (ones==1) {
                System.out.print("one");
            }
            if (ones==2) {
                System.out.print("two");
            }
            if (ones==3) {
                System.out.print("three");
            }
            if (ones==4) {
                System.out.print("four");
            }
            if (ones==5) {
                System.out.print("five");
            }
            if (ones==6) {
                System.out.print("six");
            }
            if (ones==7) {
                System.out.print("seven");
            }
            if (ones==8) {
                System.out.print("eight");
            }
            if (ones==9) {
                System.out.print("nine");
            }
        }

    }
}