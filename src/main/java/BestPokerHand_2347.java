class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer, Integer> a = new HashMap<>();
        HashMap<Character, Integer> b = new HashMap<>();
        String h = "High Card";
        for (int i : ranks) {
            a.put(i, a.getOrDefault(i, 0) + 1);
        }
        for (char i : suits) {
            b.put(i, b.getOrDefault(i, 0) + 1);
        }
        if (b.containsValue(5)) {
            return "Flush";
        }
        if (a.containsValue(3) || a.containsValue(4) || a.containsValue(5)) {
            return "Three of a Kind";
        }
        if (a.containsValue(2)) {
            return "Pair";
        }
        return h;
    }
}