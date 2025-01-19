public class SearchIN2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int high = m * n - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int row = mid / n;
            int col = mid % n;

            int elem = matrix[row][col];

            if (elem == target) {
                return true;
            } else if (elem > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return false;
    }
}
