import java.util.Arrays;
import java.util.HashSet;

public class WordSerach {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                visited[i][j] = true;
                if (board[i][j] == word.charAt(0) && findAll(visited, board, i, j, word, 1)) {
                    return true;
                }
                visited[i][j] = false;
            }
        }

        return false;
    }

    public boolean findAll(boolean[][] visited, char[][] board, int row, int col, String word, int wordIndex) {
        if (wordIndex == word.length()) {
            return true;
        }
        System.out.println(board[row][col]);
        if (row - 1 >= 0 && board[row - 1][col] == word.charAt(wordIndex) && !visited[row-1][col]) {
            visited[row - 1][col] = true;
            
            boolean ans = findAll(visited, board, row - 1, col, word, wordIndex +1);
            if (ans)
                return true;
            visited[row - 1][col] = false;
        }
        if (row + 1 < board.length && board[row + 1][col] == word.charAt(wordIndex)
                && !visited[row+1][col]) {
            
            visited[row + 1][col] = true;
            boolean ans = findAll(visited, board, row + 1, col, word, wordIndex + 1);
            if (ans)
                return true;
            visited[row + 1][col] = false;
        }
        if (col - 1 >= 0 && board[row][col - 1] == word.charAt(wordIndex) && !visited[row][col-1]) {
            
            visited[row][col - 1] = true;
            boolean ans = findAll(visited, board, row, col - 1, word, wordIndex + 1);
            if (ans)
                return true;
            visited[row][col - 1] = false;
        }
        if (col + 1 < board[0].length && board[row][col + 1] == word.charAt(wordIndex) && !visited[row][col+1]) {
            visited[row][col + 1] = true;
            boolean ans = findAll(visited, board, row, col + 1, word, wordIndex + 1);
            if (ans)
                return true;
            visited[row][col + 1] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        WordSerach w = new WordSerach();
        char[][] board = { { 'A', 'B'},{'C','D'}};
        String word = "ACDB";

        System.out.println(w.exist(board, word));

    }

}
