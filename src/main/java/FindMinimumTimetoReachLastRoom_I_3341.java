import java.util.*;

class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length, m = moveTime[0].length;
        int[][] dist = new int[n][m];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[0][0] = 0;

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.offer(new int[]{0, 0, 0}); // {x, y, time}

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int x = curr[0], y = curr[1], t = curr[2];

            if (x == n - 1 && y == m - 1) return t;
            if (t > dist[x][y]) continue;

            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                int nt = Math.max(t, moveTime[nx][ny]) + 1;
                if (nt < dist[nx][ny]) {
                    dist[nx][ny] = nt;
                    pq.offer(new int[]{nx, ny, nt});
                }
            }
        }
        return -1;
    }
}
