package Recursion;

import java.util.ArrayList;
import java.util.*;

public class SortMatrixByDiagonal {
    public int[][] sortMatrix(int[][] grid) {
        if (grid.length == 1) {
            return grid;
        }
        
        for (int i = 0; i < grid.length; i++) {
            int row = i;
            int col = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            while (row < grid.length && col < grid.length) {
                arr.add(grid[row][col]);
                row++;
                col++;
            }
            Collections.sort(arr, Collections.reverseOrder());
            row = i;
            col = 0;
            while (row < grid.length && col < grid.length) {
                grid[row][col] = arr.get(col);
                row++;
                col++;
            }
        }
        for (int i = 1; i < grid.length; i++) {
            int col = i;
            int row = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            while (row < grid.length && col < grid.length) {
                arr.add(grid[row][col]);
                row++;
                col++;
            }
            Collections.sort(arr);
            col = i;
            row = 0;

            while (row < grid.length && col < grid.length) {
                grid[row][col] = arr.get(row);
                row++;
                col++;
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        SortMatrixByDiagonal s = new SortMatrixByDiagonal();
        int[][] grid = { {1,2},{1,2} };
        int[][] ans = s.sortMatrix(grid);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.println(ans[i][j]);
            }
            System.out.println();
        }
    }
}
