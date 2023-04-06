/* *****************************************************************************
 * Developed by Zahra Malaki
 * Description: This program asks the user about the counts of empty cells in
 * sudoku, and then draws it. Besides, it prints different solutions for the
 * drawn sudoku.
 ***************************************************************************** */
import java.util.Scanner;

public class Sudoku {
    public static void printSudoku(int[][] s) {

        for (int i=0;i<19;i++) {
            for (int j=0;j<19;j++) {

                int value = s[(i-1)/2][(j-1)/2];
                String ch = value == 0 ? "   " : " "+value+" ";

                if (i==0 && j==0)          { ch = "╔"; }
                else if (i==0 && j==18)    { ch = "╗"; }
                else if (i==18 && j==0)    { ch = "╚"; }
                else if (i==18 && j==18)   { ch = "╝"; }

                else if (i==0 && j%6==0)   { ch = "╦"; }
                else if (i%2==0 && j==0)   { ch = "╠"; }
                else if (i==18 && j%6==0)  { ch = "╩"; }
                else if (i%6==0 && j==18)  { ch = "╣"; }

                else if (i%6==0 && j%6==0) { ch = "╬"; }
                else if (i%6==0 && j%2==0) { ch = "╪"; }
                else if (i%2==0 && j%6==0) { ch = "╫"; }
                else if (i%2==0 && j%2==0) { ch = "┼"; }

                else if (i%6==0)           { ch = "═══"; }
                else if (j%6==0)           { ch = "║";   }
                else if (i%2==0)           { ch = "───"; }
                else if (j%2==0)           { ch = "│";   }

                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static boolean checkBlock(int[][] s, int i, int j, int value) {

        int sii = (i/3) * 3;
        int sjj = (j/3) * 3;

        for (int ii=0; ii<3; ii++) {
            for (int jj=0; jj<3; jj++) {
                if (s[ii + sii][jj + sjj] == value) { return false; }
            }
        }
        return true;
    }
    public static boolean checkColumn(int[][] s, int i, int j, int value) {

        for (int ii=0; ii<9; ii++) {
            if (value == s[ii][j]) { return false; }
        }
        return true;
    }
    public static boolean checkRow(int[][] s, int i, int j, int value) {

        for (int jj=0; jj<9; jj++) {
            if (value == s[i][jj]) { return false; }
        }
        return true;
    }
    public static int[] randomListGenerator() {
        int[] l = {1,2,3,4,5,6,7,8,9};
        for (int i=0; i<9; i++) {
            int j = (int) (Math.random() * 9);
            int temp = l[i];
            l[i] = l[j];
            l[j] = temp;
        }
        return l;
    }
    public static boolean fillSudoku(int[][] s, int i, int j) {
        if (i == 9) { return true; }
        if (s[i][j]==0) {
            int[] valueList = randomListGenerator();
            for (int iv=0; iv<9; iv++){
                int v = valueList[iv];
                if(!checkColumn(s,i,j,v) || !checkRow(s,i,j,v) || !checkBlock(s,i,j,v)) { continue; }
                s[i][j] = v;
                boolean ok;
                if (j==8)  { ok = fillSudoku(s,i+1,0); }
                else       { ok = fillSudoku(s,i,j+1); }
                if (ok)    { return true;}
            }
            s[i][j] = 0;
            return false;
        }
        else {
            if (j==8)  { return fillSudoku(s,i+1,0); }
            else       { return fillSudoku(s,i,j+1); }
        }
    }
    public static int[][] sudokuGenerator(int emptyCellCount) {
        int[][] sudoku = new int[9][9];
        fillSudoku(sudoku,0,0);
        int emptyCell =0;
        while (emptyCell<emptyCellCount) {
            int i = (int) (Math.random() * 9);
            int j = (int) (Math.random() * 9);
            if (sudoku[i][j]==0) {
                continue;
            }
            emptyCell++;
            sudoku[i][j]=0;
        }
        return sudoku;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter empty cell count :");
        int emptyCell = input.nextInt();
        int[][] sudoku = sudokuGenerator(emptyCell);
        printSudoku(sudoku);

        for (int i=0; i<9; i++) {

            int[][] _sudoku= new int[9][9];

            for (int ii=0; ii<9; ii++) {
                for(int jj=0; jj<9;jj++) {
                    _sudoku[ii][jj] = sudoku[ii][jj];

                }
            }
            fillSudoku(_sudoku,0,0);
            printSudoku(_sudoku);

        }

    }
}