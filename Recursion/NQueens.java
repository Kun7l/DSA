import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> finalAns = new ArrayList<>();
        HashSet<Integer> col = new HashSet<>();
        HashSet<Integer> posDiag = new HashSet<>();
        HashSet<Integer> negDiag = new HashSet<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        placeQueens(finalAns, board, col, posDiag, negDiag, n, 0);
        return finalAns;
    }

    public void placeQueens(List<List<String>> finalAns, char[][] board, HashSet<Integer> column,
            HashSet<Integer> posDiag, HashSet<Integer> negDiag, int n, int row) {
        if (row == n) {
            finalAns.add(returnAns(board, n));
            return;
        }

        for (int col = 0; col < n; col++) {
            if(!column.contains(col) && !posDiag.contains(row+col) && !negDiag.contains(row-col)){
                board[row][col] = 'Q';
                column.add(col);
                posDiag.add(row+col);
                negDiag.add(row-col);
                placeQueens(finalAns, board, column, posDiag, negDiag, n, row+1);
                board[row][col] = '.';
                column.remove(col);
                posDiag.remove(row+col);
                negDiag.remove(row-col);
            }
        }
    }

    public ArrayList<String> returnAns(char[][] board, int n) {
        ArrayList<String> rowBuilder = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String newString = new String(board[i]);
            rowBuilder.add(newString);
        }
        return rowBuilder;
    }

    public static void main(String[] args) {
        NQueens n = new NQueens();
        System.out.println(n.solveNQueens(5));

    }

}
