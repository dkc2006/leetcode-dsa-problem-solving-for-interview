class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0;
        int col = cols - 1;
        int count = 0;

        while (row < rows && col >= 0) {
            if (grid[row][col] >= 0) {
                row++;
            } else {
                count += rows - row;
                col--;
            }
        }

        return count;
    }
}