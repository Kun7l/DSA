public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        int end = -1;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Integer.valueOf(num.charAt(i)) % 2 != 0) {
                end = i;
            }
        }
        if (end == -1) {
            return "";
        } else {
            return num.substring(0, end);
        }

    }
}
