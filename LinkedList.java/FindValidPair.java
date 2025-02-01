import java.util.HashMap;

public class FindValidPair {
     public String findValidPair(String s) {
        HashMap<Integer, Integer> set = new HashMap<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = Character.getNumericValue(s.charAt(i));
            if (set.containsKey(ch)) {
                set.put(ch, set.get(ch) + 1);
            } else {
                set.put(ch, 1);
            }
        }

        for (int i = 0; i < s.length() -1; i++) {
            int ch = Character.getNumericValue(s.charAt(i));
            int nextCh = Character.getNumericValue(s.charAt(i+1));
            if (ch != nextCh) {
                if(ch == set.get(ch) && nextCh == set.get(nextCh)){
                    ans += ch;
                    ans += nextCh;
                    break;
                }
                else{
                    ans = "";
                }
            }
        }
        return ans;
    }
}
