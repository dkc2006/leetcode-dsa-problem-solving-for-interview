class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) return false;
        Map<Integer, Integer> countMap = new TreeMap<>();
        for (int card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }
        for (int key : countMap.keySet()) {
            int count = countMap.get(key);
            if (count > 0) {
                for (int i = 0; i < groupSize; i++) {
                    int curr = key + i;
                    if (countMap.getOrDefault(curr, 0) < count) {
                        return false;
                    }
                    countMap.put(curr, countMap.get(curr) - count);
                }
            }
        }
        return true;
    }
}