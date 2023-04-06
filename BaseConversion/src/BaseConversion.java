/* ********************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets a number and converts it from b1 base to b2 base.
 ******************************************************************************** */
import java.util.*;

public class BaseConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            //-------------------------------Receiving inputs-----------------------------------------------------------

            System.out.println("Please enter n (an integer number) :");
            String n = input.next();
            System.out.println("Please enter b1 (primitive base of n) :");
            int b1 = input.nextInt();
            System.out.println("Please enter b2 (secondary base of n) : ");
            int b2 = input.nextInt();

            //--------------------------------First step : Converting b1 to decimal-------------------------------------

            int sum = 0;
            for (int i = 0, j = (n.length() - 1); j >= 0; i++, j--) {
                char ch = n.charAt(j);
                int value = 0;
                if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
                    value = ch - '0';
                }
                if (ch == 'A') value = 10;
                else if (ch == 'B') value = 11;
                else if (ch == 'C') value = 12;
                else if (ch == 'D') value = 13;
                else if (ch == 'E') value = 14;
                else if (ch == 'F') value = 15;

                sum += value * Math.pow(b1, i);
            }

            //--------------------------------Second step : Converting decimal to b2------------------------------------

            StringBuilder str = new StringBuilder("");
            int tmp = 0;
            StringBuilder _str;
            for (int i = 0; ; i++) {

                int remain = sum % b2;
                if (sum / b2 == 0) {
                    _str = str.insert(0, remain);
                    break;
                }

                String value = switch (remain) {
                    case 0 -> "0";
                    case 1 -> "1";
                    case 2 -> "2";
                    case 3 -> "3";
                    case 4 -> "4";
                    case 5 -> "5";
                    case 6 -> "6";
                    case 7 -> "7";
                    case 8 -> "8";
                    case 9 -> "9";
                    case 10 -> "A";
                    case 11 -> "B";
                    case 12 -> "C";
                    case 13 -> "D";
                    case 14 -> "E";
                    case 15 -> "F";
                    default -> "";
                };
                _str = str.insert(0, value);
                sum /= b2;

            }

            System.out.print("result: " + _str);

            //--------------------------------Finished!-----------------------------------------------------------------

            System.out.println("\nDo you want to run again? answer with y or n");
            String d = input.next();
            if (d.toLowerCase().startsWith("n")) {
                System.out.println("Finished!");
                break;
            }
        }

    }
}