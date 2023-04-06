/* *************************************************************************************
 * Developed by Zahra Malaki
 * Description: This program is for a simple calculator that does addition, subtraction,
 * multiplication and division.
 ************************************************************************************* */
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter your mathematical operation:");
            String str = input.nextLine();
            str= str.replace(" ","");
            char temp1= str.charAt(0);
            char temp3= str.charAt(1);
            char temp2= str.charAt(2);

            int a=0;
            int b=0;
            int answer=0;

            switch (temp1) {
                case '0' -> a = 0;
                case '1' -> a = 1;
                case '2' -> a = 2;
                case '3' -> a = 3;
                case '4' -> a = 4;
                case '5' -> a = 5;
                case '6' -> a = 6;
                case '7' -> a = 7;
                case '8' -> a = 8;
                case '9' -> a = 9;
            }

            switch (temp2) {
                case '0' -> b = 0;
                case '1' -> b = 1;
                case '2' -> b = 2;
                case '3' -> b = 3;
                case '4' -> b = 4;
                case '5' -> b = 5;
                case '6' -> b = 6;
                case '7' -> b = 7;
                case '8' -> b = 8;
                case '9' -> b = 9;
            }
            System.out.println("Here is the answer:");

            switch (temp3) {
                case '+': answer = a+b; System.out.println(answer);break;
                case '-': answer = a-b; System.out.println(answer);break;
                case '*': answer = a*b; System.out.println(answer);break;
                case '/':
                    if (b==0) {System.out.println("Invalid!");}
                    else { answer = a/b; System.out.println(answer); }
                    break;
            }

            System.out.println("Do you want to run again? Please answer with(y|n)");
            if (input.nextLine().toLowerCase().startsWith("n")) { break; }
        }
    }
}
