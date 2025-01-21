public class RotateString {
    public boolean rotateString(String s, String goal) {
        String inter = "";
        boolean ans = false;
        int j = 0;
        for (int i = s.length()-1; i>=0; i--) {
            j = i;
            int count = j + s.length();
            inter = "";
            while (j != count) {
                inter += s.charAt(j%s.length());
                j++;
            }
            if (inter.compareTo(goal)==0) {
                ans = true;
                break;
            }
        }
        return ans;
    }
}
