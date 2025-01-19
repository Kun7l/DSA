public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        boolean done = true;
        int min = Integer.MAX_VALUE;
        String ans = "";
        for (int i = 0; i < strs.length; i++) {
            min = Math.min(min,strs[i].length());
        }

        for (int i = 0; i <min; i++) {
            char check = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != check ) {
                    done = false;
                    break;
                }
            }
            if (done) {
                ans += check;
            }
        }
        return ans;
    }
}
