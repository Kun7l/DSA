import java.util.HashMap;
import java.util.Map;

public class RomanTOInteger {
    public int romanToInt(String s) {
        int result = 0;
        int cur = 0;
        int prev = 1;

        for (int i = s.length()-1; i>=0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    cur = 1;
                    break;
                case 'V':
                    cur = 5;
                    break;
                case 'X':
                    cur = 10;
                    break;
                case 'L':
                    cur = 50;
                    break;
                case 'C':
                    cur = 100;
                    break;
                case 'D':
                    cur = 500;
                    break;
                case 'M':
                    cur = 1000;
                    break;
                default:
                    break;
            }
            
            if (cur<prev) {
                result -= cur;
            }
            else result += cur;

            prev = cur;
        }
        return result;
    }
}
