
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (count == 0) {
                count++;
            }
            else{
                if(s.charAt(i) == '('){
                    count++;
                    ans += s.charAt(i);
                }
                else{
                    count--;
                    if (count!=0) {
                        ans += s.charAt(i);
                    }
                    
                }
            }
        }
        return ans;
    }
}
