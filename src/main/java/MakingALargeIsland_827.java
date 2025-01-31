class Solution {
    private static final int[] DIR = {0, 1, 0, -1, 0}; // Directions for DFS

    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int maxArea = 0, islandId = 2;
        Map<Integer, Integer> areaMap = new HashMap<>();

        // Step 1: Identify islands and store their areas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, islandId);
                    areaMap.put(islandId++, area);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        // Step 2: Try converting a `0` to `1` and calculate the largest island possible
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> uniqueIslands = new HashSet<>();
                    int newSize = 1; // The flipped `0` itself
                    for (int d = 0; d < 4; d++) {
                        int ni = i + DIR[d], nj = j + DIR[d + 1];
                        if (ni >= 0 && nj >= 0 && ni < n && nj < n && grid[ni][nj] > 1) {
                            uniqueIslands.add(grid[ni][nj]);
                        }
                    }
                    for (int id : uniqueIslands) newSize += areaMap.get(id);
                    maxArea = Math.max(maxArea, newSize);
                }
            }
        }

        return maxArea == 0 ? n * n : maxArea; // Edge case: if grid is all `1`
    }

    private int dfs(int[][] grid, int i, int j, int id) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != 1) return 0;
        grid[i][j] = id;
        int area = 1;
        for (int d = 0; d < 4; d++) {
            area += dfs(grid, i + DIR[d], j + DIR[d + 1], id);
        }
        return area;
    }
}
