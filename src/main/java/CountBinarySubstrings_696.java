class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> groups = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                groups.add(count);
                count = 1;
            }
        }
        groups.add(count);
        int res = 0;
        for (int i = 1; i < groups.size(); i++) {
            res += Math.min(groups.get(i - 1), groups.get(i));
        }

        return res;
    }
}