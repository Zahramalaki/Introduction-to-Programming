/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program draws a rhombus with characters.
 ***************************************************************************** */
import java.util.*;

public class RhombusDrawing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive even number:");
        int n=input.nextInt();

        if (n<0 || n%2==1) {
            System.out.println("Invalid!");
        }
        else {

            for (int i=0;i<=n;i++) {

                for (int j=0;j<=n;j++) {

                    if (Math.abs(Math.abs(i-n/2.0) + Math.abs(j-n/2.0) - n/2.0) < 0.00000001) {

                        if ( ((i>0 && i<n/2) && (j>0 && j<n/2)) || ((i>n/2 && i<n) && (j>n/2 && j<n)) ) {
                            System.out.print('/');
                        }
                        else if ( ((i>0 && i<n/2) && (j>n/2 && j<n)) || ((i>n/2 && i<n) && (j>0 && j<n/2)) ) {
                            System.out.print('\\');
                        }
                        else if (i==0) {
                            System.out.print('▲');
                        }
                        else if (j==n) {
                            System.out.print('►');
                        }
                        else if (i==n) {
                            System.out.print('▼');
                        }
                        else {
                            System.out.print('◄');
                        }
                    }
                    else {
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }

        }

    }
}