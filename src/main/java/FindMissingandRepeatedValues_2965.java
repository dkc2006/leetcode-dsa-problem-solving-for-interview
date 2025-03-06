import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> seen = new HashSet<>();
        int repeated = -1;
        int expectedSum = n * n * (n * n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = grid[i][j];
                actualSum += value;
                if (seen.contains(value)) {
                    repeated = value;
                } else {
                    seen.add(value);
                }
            }
        }
        int missing = expectedSum - (actualSum - repeated);
        return new int[]{repeated,missing};
    }
}
