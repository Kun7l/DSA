import java.util.Arrays;

public class FindSpecialSubstringOfLengthK {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        System.out.println(Arrays.toString(pizzas));
        int itr = pizzas.length/4;
        int i = pizzas.length-1;
        long ans = 0;
        while (itr!=0) {
            ans += pizzas[i];
            i-=2;
            itr--;
        }
        return ans;
    }

    public static void main(String[] args) {
        FindSpecialSubstringOfLengthK f = new FindSpecialSubstringOfLengthK();
        System.out.println(f.maxWeight(new int[]{5,5,3,1,5,5,2,4,4,4,4,3}));
    }
}
