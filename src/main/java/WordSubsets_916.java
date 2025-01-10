import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String b : words2) {
            for (char c : b.toCharArray()) {
                maxFreq[c - 'a'] = Math.max(maxFreq[c - 'a'], count(c, b));
            }
        }

        List<String> result = new ArrayList<>();
        for (String a : words1) {
            boolean universal = true;
            for (int i = 0; i < 26; i++) {
                if (count((char) (i + 'a'), a) < maxFreq[i]) {
                    universal = false;
                    break;
                }
            }
            if (universal) result.add(a);
        }

        return result;
    }

    private int count(char c, String word) {
        int freq = 0;
        for (char w : word.toCharArray()) {
            if (w == c) freq++;
        }
        return freq;
    }
}
