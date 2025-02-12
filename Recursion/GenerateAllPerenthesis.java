package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPerenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        String sol = "";
        generateAll(ans, sol, 0, 0, n);
        return ans;
    }

    public void generateAll(List<String> ans, String sol, int left, int right, int n) {
        if (left == n && right == n) {
            ans.add(sol);
            return;
        }
        if (left < n) {
            sol += "(";
            generateAll(ans, sol, left + 1, right, n);
            sol = sol.substring(0, sol.length() - 1);
        }

        if (right < left) {
            sol += ")";
            generateAll(ans, sol, left, right + 1, n);
            sol = sol.substring(0, sol.length() - 1);
        }
    }

    public static void main(String[] args) {
        GenerateAllPerenthesis g = new GenerateAllPerenthesis();
        System.out.println(g.generateParenthesis(2));
    }
}
