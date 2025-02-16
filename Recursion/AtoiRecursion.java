package Recursion;

public class AtoiRecursion {
    public int myAtoi(String s) {
        boolean isPositive = true;
        if (s.charAt(0) == '-') {
            isPositive = false;
            s = s.substring(1);
        }

        if (s.length() == 1) {
            return Integer.valueOf(s);
        }
        int last = Integer.valueOf(Character.getNumericValue(s.charAt(s.length() - 1)));
        String sub = s.substring(0, s.length() - 1);
        int count = myAtoi(sub);
        if (!isPositive) {
            return ((count * 10) + last) * -1;
        }
        return (count * 10) + last;
    }

    public static void main(String[] args) {
        AtoiRecursion a = new AtoiRecursion();
        System.out.println(a.myAtoi("412"));
    }
}
