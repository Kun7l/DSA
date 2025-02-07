public class SumOfSquareNum {
    public boolean judgeSquareSum(int c) {
        int low = 0;
        int high = (int)Math.sqrt(c);
        

        while (low<=high) {
            long mid = ((long)(low*low)+(long)(high*high));

            if (mid == c) {
                System.out.println(low);
                System.out.println(high);
                return true;
            }
            else if(mid>c){
                high = high -1;
            }
            else{
                low = low+1;
            }
        }
        return false;
    }

    public int countSum(int a,int b){
        return (int)(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
