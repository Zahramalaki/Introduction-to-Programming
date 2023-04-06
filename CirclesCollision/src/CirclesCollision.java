/* **********************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets (x,y) and r for 2 circles and determines whether
 * they collide or not.
 * (x,y) --> (coordinates of the center of the circle)
 * r --> (the radius of the circle)   .
 ********************************************************************************** */
import java.util.*;

public class CirclesCollision {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number as x1:");
        double x1 = input.nextDouble();

        System.out.print("Please enter a number as y1:");
        double y1 = input.nextDouble();

        System.out.print("Please enter a number as r1:");
        double r1 = input.nextDouble();

        System.out.print("Please enter a number as x2:");
        double x2 = input.nextDouble();

        System.out.print("Please enter a number as y2:");
        double y2 = input.nextDouble();

        System.out.print("Please enter a number as r2:");
        double r2 = input.nextDouble();

        double d = r1 + r2;
        double h = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));

        if (d >= h) { System.out.print("These two circles collide.");}
        if (d < h)  { System.out.print("These two circles do not collide.");}

    }

}
