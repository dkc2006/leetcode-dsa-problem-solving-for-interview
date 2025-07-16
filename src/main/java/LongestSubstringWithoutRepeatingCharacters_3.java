class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int[] lastSeen = new int[128];
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, lastSeen[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            lastSeen[currentChar] = right + 1;
        }
        return maxLength;
    }
}