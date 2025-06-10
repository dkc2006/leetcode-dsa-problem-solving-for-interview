class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            // System.out.print(curr + " ");
            for (int nbr : rooms.get(curr)) {
                if (!visited[nbr]) {
                    q.add(nbr);
                    visited[nbr] = true;
                }
            }
        }
        for (boolean v : visited) {
            if (!v) return false;
        }

        return true;
    }
}
