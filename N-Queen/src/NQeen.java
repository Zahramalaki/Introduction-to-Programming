/* ********************************************************************************
 * Developed by Zahra Malaki
 * Description: N-Queens problem is to place n queens in such a manner on an n-by-n
 * chessboard that no queens attack each other by being in the same row, column or
 * diagonal. This program gets n and prints the correct place of queens.
 ******************************************************************************** */
import java.util.*;

public class NQeen {
    public static boolean checkRow(int[]cb , int v, int i ){
        for (int j = 0; j < i ; j++) {
            if (cb[j] == v) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkDiogonal(int[]cb , int v , int i ){
        for (int j = 0; j < i ; j++) {
            if (Math.abs(i-j)==Math.abs(cb[j]-v)) {
                return false;
            }
        }
        return true;
    }
    public static boolean fillChessboard(int [] cb , int i){
        int n = cb.length;
        if (i == n) {
            return true;
        }
        boolean ok = false;
        for (int v = 0; v < n ; v++) {
            if (checkDiogonal(cb,v,i) && checkRow(cb,v,i)) {
                cb[i]=v;
                ok=fillChessboard(cb,i+1);
                if (ok) return true;
            }
        }
        return false;

    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        int[] cb = new int[n];

        if (fillChessboard(cb,0)) {
            for (int i = 0; i < n; i++) {
                if   (i==n-1) System.out.print(cb[i]);
                else System.out.print(cb[i] + " , ");
            }
        }
        else {
            System.out.print("error");
        }

    }
}