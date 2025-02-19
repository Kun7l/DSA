import java.util.ArrayList;

public class Leetcode1415 {
    public String getHappyString(int n, int k) {
        char[] charArray = {'a','b','c'};
        ArrayList<String> ans = new ArrayList<>();
        String sol = "";
        findall(n, ans, charArray, sol,k);
        if (k>ans.size()) {
            return "";
        }
        else{
            System.out.println(ans);
            return ans.get(k-1);
        }
    }

    public void findall(int n,  ArrayList<String> ans,char[] charArray,String sol,int k){
        if (ans.size() == k) {
            return;
        }
        if (sol.length() == n) {
            ans.add(sol);
            return;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (sol.length() == 0 || sol.charAt(sol.length()-1) != charArray[i] ) {
                sol+=charArray[i];
                findall(n, ans, charArray, sol,k);
                sol = sol.substring(0, sol.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        Leetcode1415 l = new Leetcode1415();
        System.out.println(l.getHappyString(1, 1));
    }

}
