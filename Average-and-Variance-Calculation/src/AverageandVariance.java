/* ********************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets numbers and prints the average and the variance
 * of given numbers.
 ******************************************************************************** */
import java.util.*;

public class AverageandVariance {

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
            double av = 0;
            for (int i=0; i<n; i++) {
                av += a[i]/n;
            }
            System.out.println("Average :" + av);

            double v = 0;
            for (int i=0; i<n; i++) {
                v += Math.pow( a[i]-av , 2 )/n;
            }
            System.out.println("Variance:"+v);

            System.out.println("Do you want to run again? answer with y or n");
            String d = input.next();
            if (d.toLowerCase().startsWith("n")) { System.out.println("Finished!");break;}

        }
    }
}