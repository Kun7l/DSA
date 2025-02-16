package Recursion;

import java.util.Arrays;

public class SumOfN {

    public String sum(String str) {
        if (str.length() == 1) {
            return str;
        }
        String s = str.charAt(str.length()-1) + sum(str.substring(0, str.length()-1));
        return s;
    }

    public static void main(String[] args) {
        SumOfN s = new SumOfN();
        String str  = "racecar";
       if (str.equals(s.sum(str))) {
        System.out.println("is pelindrom");
       }
       else{
        System.out.println("is not pelindrom");
       }
    }
}
