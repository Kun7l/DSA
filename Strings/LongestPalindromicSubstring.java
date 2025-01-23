public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result = "";
        int left = 0;
        int right = 0;

        while (left != s.length() && right != s.length()+1) {
            String sub = s.substring(left, right);
            if (isPelindrom(sub)) {
                if (result.length() < sub.length()) {
                    result = sub;
                }
            }
            right++;
            if (right == s.length()+1 && left!= s.length()) {
                left ++;
                right = left;
            }
            System.out.println("left "+left);
            System.out.println("right "+right);
        }

        return result;
    }

    public boolean isPelindrom(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r = s.charAt(i) + r;
        }
        if (r.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

}
