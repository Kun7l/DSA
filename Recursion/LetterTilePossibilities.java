import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
       HashSet<String> ans = new HashSet<>();
        ArrayList<Boolean> isUsed = new ArrayList<>(Collections.nCopies(tiles.length(), false));
        String sol = "";
        findAll(ans, tiles, sol, isUsed);
        return ans.size();
    }

    public void findAll(HashSet<String> ans , String tiles, String sol, ArrayList<Boolean> isUsed) {
       
        for (int i = 0; i < tiles.length(); i++) {
            if (!isUsed.get(i)) {
                isUsed.set(i, true);
                sol += tiles.charAt(i);
                ans.add(sol);
                findAll(ans, tiles, sol, isUsed);
                sol = sol.substring(0, sol.length() - 1);
                isUsed.set(i, false);
            }
        }
    }

    public static void main(String[] args) {
        LetterTilePossibilities l = new LetterTilePossibilities();
        System.out.println(l.numTilePossibilities("A"));
    }
}
