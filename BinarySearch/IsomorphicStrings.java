import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        boolean ans = true;
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                if (hashMap.containsValue(t.charAt(i))) {
                    ans = false;
                    break;
                }
                hashMap.put(s.charAt(i), t.charAt(i));
            }
            else{
                if (hashMap.get(s.charAt(i)) != t.charAt(i)) {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}
