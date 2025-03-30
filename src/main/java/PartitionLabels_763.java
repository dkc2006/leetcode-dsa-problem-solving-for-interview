import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String str) {
        List<Integer> partitions = new ArrayList<>();
        int[] lastIndex = new int[26];

        for (int i = 0; i < str.length(); i++)
            lastIndex[str.charAt(i) - 'a'] = i;

        int start = 0, end = 0;
        for (int i = 0; i < str.length(); i++) {
            end = Math.max(end, lastIndex[str.charAt(i) - 'a']);
            if (i == end) {
                partitions.add(end - start + 1);
                start = i + 1;
            }
        }
        return partitions;
    }
}
