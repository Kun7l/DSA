public class AtoiStringToInteger {
    public int myAtoi(String s) {
        if (s.length()==0) {
            return 0;
        }
        long ans = 0;
        int i = 0;
        boolean isPositive = true;
        boolean breakLoop = false;
        s = s.trim();

        if (s.charAt(0) == '-') {
            isPositive = false;
            i=1;
        }
        else if (s.charAt(0)== '+') {
            i=1;
        }
        while(i!=s.length()){
            switch (s.charAt(i)) {
                case '0':
                    ans = ans*10;
                    break;
                case '1':
                    ans = ans*10 + 1;
                    break;
                case '2':
                ans = ans*10 + 2;
                    break;
                case '3':
                ans = ans*10 + 3;
                    break;
                case '4':
                ans = ans*10 + 4;
                    break;
                case '5':
                ans = ans*10 + 5;
                    break;
                case '6':
                ans = ans*10 + 6;
                    break;
                case '7':
                ans = ans*10 + 7;
                    break;
                case '8':
                ans = ans*10 + 8;
                    break;
                case '9':
                ans = ans*10 + 9;
                    break;
                default:
                breakLoop = true;
                    break;
            }
            i++;
            if (breakLoop) {
                break;
            }
            if (ans > 2147483647) {
                break;
            }
            if (ans<-2147483648) {
                break;
            }
        }
        if (!isPositive) {
            ans = ans * -1;
        }
        if (ans>2147483647) {
            ans = 2147483647;
        }
        if (ans<-2147483648) {
            ans = -2147483648;
        }
        
        return (int)ans;
    }
}
