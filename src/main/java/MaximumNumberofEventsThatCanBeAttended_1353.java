import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int day = 0, res = 0, i = 0, n = events.length;

        while (i < n || !pq.isEmpty()) {
            // Agar heap khali hai to current day ko next event ke start day pe le jao
            if (pq.isEmpty()) {
                day = events[i][0];
            }

            // Current day tak ke saare events heap me daal do
            while (i < n && events[i][0] <= day) {
                pq.offer(events[i][1]);
                i++;
            }

            // Heap se expired events hatao
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Agar koi event hai to attend karo
            if (!pq.isEmpty()) {
                pq.poll();
                res++;
                day++;
            }
        }
        return res;
    }
}
