import java.util.ArrayList;

public class SumOfSubset {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> finalAns = new ArrayList<>();
        findAll(finalAns, 0, arr, 0);
        return finalAns;
    }

    public void findAll(ArrayList<Integer> finalAns,int sum,int[] arr,int index){
        if (index == arr.length) {
            finalAns.add(sum);
            return;
        }

        sum += arr[index];
        findAll(finalAns, sum, arr, index+1);
        sum -= arr[index];

        findAll(finalAns, sum, arr, index+1);
    }
    public static void main(String[] args) {
        SumOfSubset s = new SumOfSubset();
        int[] arr = {1,2,1};
        System.out.println(s.subsetSums(arr));
    }
}
