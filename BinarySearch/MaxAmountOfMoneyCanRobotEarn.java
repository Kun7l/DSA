public class MaxAmountOfMoneyCanRobotEarn {
    public int maximumAmount(int[][] coins) {
        int count = 0;
        int row = 0;
        int col = 0;
        int lifeLine = 2;
        while (row != coins.length && col != coins[0].length) {
            System.out.println("row " + row);
            System.out.println("col " + col);
            if (coins[row][col] >= 0) {
                count += coins[row][col];
            } else {
                if (lifeLine <= 0) {
                    count -= Math.abs(coins[row][col]);
                } else {
                    lifeLine--;
                }
            }
            System.out.println("count"+count);

            // check for next or down
            int downValue = coins[row][col];
            int rightValue = coins[row][col];
            if ((col == coins[0].length - 2 && row == coins.length - 1)
                    || (col == coins[0].length - 1 && row == coins.length-2)) {
                row = coins.length - 1;
                col = coins[0].length - 1;
            }
            else if(col == coins[0].length-1 && row == coins.length-1){
                break;
            }
            else  {
         
                downValue = coins[row + 1][col];
                rightValue = coins[row][col + 1];

                System.out.println("rightvalue " + rightValue);
                System.out.println("DOwnValue " + downValue);
                if (rightValue >= 0 && downValue >= 0 && rightValue >= downValue) {
                    col++;
                } else if (rightValue >= 0 && downValue >= 0 && downValue > rightValue) {
                    row++;
                } else if (rightValue < 0 && downValue >= 0) {
                    row++;
                } else if (rightValue >= 0 && downValue < 0) {
                    col++;
                } else if (rightValue < 0 && downValue < 0 && rightValue < downValue) {
                    col++;
                } else if (rightValue < 0 && downValue < 0 && downValue < rightValue) {
                    row++;
                }
            }

        }
        return count;
    }
}
