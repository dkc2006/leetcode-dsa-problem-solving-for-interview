class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length)
            return nums;

        Map<Integer, Integer> count = new HashMap<>();
        for (int value : nums)
            count.put(value, count.getOrDefault(value, 0) + 1);

        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> count.get(a) - count.get(b)
        );

        for (int value : count.keySet()) {
            heap.add(value);
            if (heap.size() > k)
                heap.poll();
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++)
            ans[i] = heap.poll();

        return ans;
    }
}