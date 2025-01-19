public class RowWithMax1s {
    public int rowWithMax1s(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        int ans = -1;
        for (int i = 0; i <row; i++) {
            count=0;
            for (int j = 0; j <col; j++) {
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount = count;
                ans = i;
            }
        }
        return ans;
    }
}
