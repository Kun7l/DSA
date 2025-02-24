import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> finalAns = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        findAll(finalAns, ans, s, 0);
        return finalAns;
    }

    public void findAll(List<List<String>> finalAns, List<String> ans, String s, int index) {
        if (index == s.length()) {
            finalAns.add(new ArrayList<>(ans));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (isPelindrom(s, index, i)) {
                ans.add(s.substring(index, i + 1));
                findAll(finalAns, ans, s, i + 1);
                ans.remove(ans.size() - 1);
            }

        }
    }

    public boolean isPelindrom(String s, int start, int end) {
        s = s.substring(start, end+1);
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        System.out.println(s);
        System.out.println(r);
        return r.equals(s);
    }

    public static void main(String[] args) {
        PalindromePartitioning p = new PalindromePartitioning();
        System.out.println(p.partition("aab"));

    }
}
