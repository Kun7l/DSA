import java.lang.reflect.Array;
import java.util.*;

public class RatInMaze {
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] occupied = new boolean[mat.size()][mat.size()];
        String str = "";
        occupied[0][0] = true;
        getPath(0, 0, mat, ans, occupied, str);
        return ans;
    }

    public void getPath(int row, int col, ArrayList<ArrayList<Integer>> mat, ArrayList<String> ans,
            boolean[][] occupied, String str) {
        if (isBlocked(mat, occupied, row, col) || (row == mat.size() - 1 && col == mat.size() - 1)) {

            if (row == mat.size() - 1 && col == mat.size() - 1) {
                ans.add(str);
            }
            return;
        }
        if (row + 1 < mat.size() && !occupied[row + 1][col] && mat.get(row + 1).get(col) == 1) {
            str += "D";

            occupied[row + 1][col] = true;
            getPath(row + 1, col, mat, ans, occupied, str);
            occupied[row + 1][col] = false;
            str = str.substring(0, str.length() - 1);
        }
        if (col - 1 >= 0 && !occupied[row][col - 1] && mat.get(row).get(col - 1) == 1) {
            str += "L";
            occupied[row][col - 1] = true;
            getPath(row, col - 1, mat, ans, occupied, str);
            occupied[row][col - 1] = false;
            str = str.substring(0, str.length() - 1);
        }

        if (col + 1 < mat.size() && !occupied[row][col + 1] && mat.get(row).get(col + 1) == 1) {
            str += "R";
            occupied[row][col + 1] = true;
            getPath(row, col + 1, mat, ans, occupied, str);
            occupied[row][col + 1] = false;
            str = str.substring(0, str.length() - 1);
        }
        if (row - 1 >= 0 && !occupied[row - 1][col] && mat.get(row - 1).get(col) == 1) {
            str += "U";
            occupied[row - 1][col] = true;
            getPath(row - 1, col, mat, ans, occupied, str);
            occupied[row - 1][col] = false;
            str = str.substring(0, str.length() - 1);
        }

    }

    public boolean isBlocked(ArrayList<ArrayList<Integer>> mat, boolean[][] occupied, int row, int col) {
        if (row + 1 < occupied.length && (!occupied[row + 1][col] || mat.get(row).get(col) == 1)) {
            return false;
        }
        if (row - 1 >= 0 && (!occupied[row - 1][col] || mat.get(row - 1).get(col) == 1)) {
            return false;
        }
        if (col + 1 < occupied.length && (!occupied[row][col + 1] || mat.get(row).get(col + 1) == 1)) {
            return false;
        }
        if (col - 1 >= 0 && (!occupied[row][col - 1] || mat.get(row).get(col - 1) == 1)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> group = new ArrayList<ArrayList<Integer>>();
        // group.add(new ArrayList<>(Arrays.asList(1, 0)));
        // group.add(new ArrayList<>(Arrays.asList(1, 1)));
        group.add(new ArrayList<>(Arrays.asList(1, 0, 0, 0)));
        group.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        group.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        group.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));

        RatInMaze r = new RatInMaze();
        System.out.println(r.findPath(group));
    }

}
