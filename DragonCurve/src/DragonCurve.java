/* ********************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets n as an integer and prints the n-order of dragon
 * curve fractal. For more information about dragon curve, you can check this link:
 * https://rosettacode.org/wiki/Dragon_curve
 ******************************************************************************** */
import java.util.*;

public class DragonCurve {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number as n:");
        int n = input.nextInt();
        input.close();

        String F= "F";
        String L= "L";
        String R= "R";

        String s1= F+L+F;
        String s2= F+R+F;
        String s3= s1+L+s2;
        String s4= s1+R+s2;

        if (n<0) {
            System.out.print("Invalid");
        }

        else {
            System.out.println("Here is the dragon curve order:");

            if (n == 0) {
                System.out.print(F);
            }
            else if (n == 1) {
                System.out.print(s1);
            }
            else {
                for (int i=2; i<=n; i++) {
                    s3 = s1+L+s2;
                    s4 = s1+R+s2;
                    s1 = s3;
                    s2 = s4;
                }
                System.out.println(s3);
            }
        }

    }
}