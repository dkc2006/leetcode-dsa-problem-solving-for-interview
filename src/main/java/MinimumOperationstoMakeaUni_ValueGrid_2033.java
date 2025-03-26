import java.util.Arrays;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;
        int a[] = new int[size];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[index++] = grid[i][j];
            }
        }
        Arrays.sort(a);
        int median = a[size / 2];
        int operations = 0;
        for (int val : a) {
            if (Math.abs(val - median) % x != 0) {
                return -1;
            }
            operations += Math.abs(val - median) / x;
        }
        return operations;
    }
}
