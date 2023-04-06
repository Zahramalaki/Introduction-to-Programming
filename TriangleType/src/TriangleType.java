/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets the value of three sides of a triangle and
 * determines the type of it.
 ***************************************************************************** */
import java.util.*;

public class TriangleType {

    public static void main (String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("L1 :");
        float l1= input.nextFloat();

        System.out.print("L2 :");
        float l2= input.nextFloat();

        System.out.print("L3 :");
        float l3= input.nextFloat();

        input.close();

        float L1= Math.min(Math.min(l1,l2),l3);
        float L3= Math.max(Math.max(l1,l2),l3);
        float L2= l1+l2+l3-L1-L3;

        if (L1>0 && L2+L1>L3) {

            if(L1==L3) {
                System.out.println("Equilateral triangle");
            }
            else if(L1==L2 || L2==L3 ) {
                System.out.println("Isosceles triangle");
            }
            else if(L3*L3==L1*L1 + L2*L2) {
                System.out.println("Right triangle");
            }
            else {
                System.out.println("Scalene triangle");
            }
        }
        else {
            System.out.print("It cant be a triangle");
        }
    }

}


