import java.util.*;

public class RatInMaze {
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> ans = new ArrayList<>();
        String str = "";
        getPath(0, 0, mat, ans, str);
        return ans;
    }

    public ArrayList<String> getPath(int row, int col, ArrayList<ArrayList<Integer>> mat, ArrayList<String> ans,
            String str) {

        if (row == mat.size() - 1 && col == mat.size() - 1) {
            if (mat.get(row).get(col) == 1) {
                ans.add(str);
            }
            return ans;
        }
        if (row == mat.size() - 1) {
            if (mat.get(row).get(col + 1) == 1) {
                str += "R";
                getPath(row, col + 1, mat, ans, str);
                str = str.substring(0, str.length() - 1);
            }
        } else if (col == mat.size() - 1) {
            if (mat.get(row + 1).get(col) == 1) {
                str += "D";
                getPath(row + 1, col, mat, ans, str);
                str = str.substring(0, str.length() - 1);
            }
        } else {
            if (mat.get(row).get(col) == 1) {

                if (mat.get(row + 1).get(col) == 1) {
                    str += "D";
                    getPath(row + 1, col, mat, ans, str);
                    str = str.substring(0, str.length() - 1);
                }
                if (mat.get(row).get(col + 1) == 1) {
                    str += "R";
                    getPath(row, col + 1, mat, ans, str);
                    str = str.substring(0, str.length() - 1);
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> group = new ArrayList<ArrayList<Integer>>();
        group.add(new ArrayList<>(Arrays.asList(1, 0)));
        group.add(new ArrayList<>(Arrays.asList(1, 0)));
        // group.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        // group.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));
        System.out.println(group.size() - 1);
        RatInMaze r = new RatInMaze();
        System.out.println(r.findPath(group));
    }

}
