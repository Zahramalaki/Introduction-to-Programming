/* ********************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets an n-by-m grid of sites and the value placed in
 * each site. When value equals 0, the system does not percolate that site; when
 * value equals 1, the system percolates that site. A system percolates if we fill
 * all open sites connected to the top row and that process fills some open site on
 * the bottom row. For the porous substance example, the open sites correspond to
 * empty space through which water might flow, so that a system that percolates
 * lets water fill open sites, flowing from top to bottom. As a result, it will
 * show us if water percolates or not.
 ******************************************************************************** */
import java.util.*;

public class Percolation {
    public static boolean startPointAnalysis(int [][] a ,int mi, int mj) {
        boolean ok ;
        for (int j = 0; j < mj ; j++) {
            if (a[0][j]==0){
                a[0][j]=2;
                ok = downAnalysis(a,1,j,mi,mj);
                if (ok) return true;
            }
        }
        return false;
    }
    public static boolean downAnalysis(int [][]a ,int i , int j , int mi ,int mj) {
        //element itself:
        if (i==mi) return true;
        if ((a[i][j]==1)) return false ;
        a[i][j]=2;

        //elements around:
        boolean ok ;
        ok = downAnalysis(a,i+1,j,mi,mj);
        if(ok) return true;
        ok = rightAnalysis(a,i,j+1,mi,mj);
        if(ok) return true;
        ok = leftAnalysis(a,i,j-1,mi,mj);
        if(ok) return true;

        return false;
    }
    public static boolean leftAnalysis(int [][]a ,int i , int j , int mi , int mj) {

        //element itself:
        if (j==-1) return false;
        if ((a[i][j]==1)) return false ;
        a[i][j]=2;

        //elements around:
        boolean ok ;
        ok = downAnalysis(a,i+1,j,mi,mj);
        if(ok) return true;
        ok = leftAnalysis(a,i,j-1,mi,mj);
        if(ok) return true;
        ok = upAnalysis(a,i-1,j,mi,mj);
        if(ok) return true;

        return false;

    }
    public static boolean rightAnalysis(int [][]a ,int i , int j , int mi , int mj) {
        //element itself:
        if (j==mj) return false;
        if ((a[i][j]==1)) return false ;
        a[i][j]=2;

        //elements around:
        boolean ok ;
        ok = downAnalysis(a,i+1,j,mi,mj);
        if(ok) return true;
        ok = rightAnalysis(a,i,j+1,mi,mj);
        if(ok) return true;
        ok = upAnalysis(a,i-1,j,mi,mj);
        if(ok) return true;

        return false;
    }
    public static boolean upAnalysis(int [][]a ,int i , int j , int mi , int mj) {
        //element itself:
        if (i==-1) return false;
        if ((a[i][j]==1)) return false ;
        a[i][j]=2;

        //elements around:
        boolean ok ;
        ok = leftAnalysis(a,i,j-1,mi,mj);
        if(ok) return true;
        ok = rightAnalysis(a,i,j+1,mi,mj);
        if(ok) return true;
        ok = upAnalysis(a,i-1,j,mi,mj);
        if(ok) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the count of rows :" );
        int mi = input.nextInt();
        System.out.print("Enter the count of columns :" );
        int mj = input.nextInt();
        System.out.println();

        int [][] a = new int [mi][mj];

        for (int i = 0; i < mi ; i++) {
            for (int j = 0; j < mj ; j++) {
                System.out.format("Enter value of index (%d,%d) :",i+1,j+1);
                a[i][j]= input.nextInt();
            }
            System.out.println("=============================");
        }

        boolean ok = startPointAnalysis(a,mi,mj);

        System.out.println("Water will penetrate from the bottom of the matrix : " + ok);

        for (int i = 0; i < mi ; i++) {
            for (int j = 0; j < mj; j++) {
                if      (a[i][j]==0) System.out.print("⬜️");
                else if (a[i][j]==1) System.out.print("⬛️");
                else if (a[i][j]==2) System.out.print("\uD83D\uDFE6");
            }
            System.out.println();
        }
    }
}