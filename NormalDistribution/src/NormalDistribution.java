/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program is simply about the formula of normal distribution
 * and also prints a random number with normal distribution.
 ***************************************************************************** */
import java.util.*;

public class NormalDistribution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number as d:");
        double d = input.nextDouble();

        System.out.print("Please enter a number as m:");
        double m = input.nextDouble();

        System.out.print("Please enter a number as x:");
        double x = input.nextDouble();


        double n = -((x-m)*(x-m))/(2*d*d) ;
        double w = Math.exp(n) ;

        double PI = Math.PI;
        double z = Math.sqrt(2*PI);

        double y = w/(z*d);
        System.out.println("Here is y:" + y);

        double r = Math.random();
        double a = Math.sqrt( (-2)* Math.log(r) ) ;
        double c = Math.sin(2*PI*r) * a;
        System.out.println("A random number with normal distribution: "+c);

    }

}