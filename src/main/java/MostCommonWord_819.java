import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        String mostCommon = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommon;
    }
}




//OR


// import java.util.*;

// class Solution {
//     public String mostCommonWord(String paragraph, String[] banned) {
//         Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
//         Map<String, Integer> wordCount = new HashMap<>();

//         for (String word : paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+")) {
//             if (!bannedSet.contains(word)) {
//                 wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//             }
//         }

//         return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
//     }
// }

