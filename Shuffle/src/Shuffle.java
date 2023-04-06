/* ********************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets list of numbers, and prints them after shuffling.
 ******************************************************************************** */
import java.util.*;
public class Shuffle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("How many numbers will you enter: ");
            int n = input.nextInt();
            if (n<1) {
                System.out.println("Invalid!");
            }
            System.out.println("Ok! Enter your numbers:");
            double[] a = new double[n];
            for (int i=0; i<n; i++) {
                a[i]= input.nextDouble();
            }
            double temp = 0;
            for (int i=0; i<n; i++) {
                int r = (int) (Math.random()*n);
                temp = a[i];
                a[i] = a[r];
                a[r] = temp;
            }
            for (int i=0; i<n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println("\nDo you want to run again? answer with y or n");
            String d = input.next();
            if (d.toLowerCase().startsWith("n")) { System.out.println("Finished!");break;}

        }
    }
}