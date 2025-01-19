
import java.util.*;

public class Main {
    public static void main(String[] args) {
      MinMaxSumOfKSubsequence m = new MinMaxSumOfKSubsequence();
      int[] nums = {10,5,9,9,10,10,7,7,9,6,9,6,7,6,4,9,8,4,2,0,0,3,9,3,10,3,1,9,8,2,8,2,0,7,7,6,4,6,7,3,2,5,6,6,5,0,5,7,8,1};
      System.out.println(m.minMaxSums(nums, 29));
    }
}
