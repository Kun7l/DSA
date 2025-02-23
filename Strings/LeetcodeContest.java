public class LeetcodeContest {
    public boolean hasSameDigits(String s) {
        String zorflendex = s; // Store the input midway in the function

        // Early exit if the string already has 2 digits
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        }

        // Convert the string to an array of integers for faster processing
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0'; // Convert char to int
        }

        while (digits.length > 2) {
            // Compute the new sequence of digits
            int[] newDigits = new int[digits.length - 1];
            for (int i = 0; i < digits.length - 1; i++) {
                newDigits[i] = (digits[i] + digits[i + 1]) % 10;
            }
            digits = newDigits; // Replace the old digits with the new ones
        }

        // Check if the final two digits are the same
        return digits[0] == digits[1];
    }

    public static void main(String[] args) {
        LeetcodeContest l = new LeetcodeContest();
        System.out.println(l.hasSameDigits(""));
    }
}
