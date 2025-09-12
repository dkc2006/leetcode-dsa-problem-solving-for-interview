import java.util.*;
class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(
                Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );

        List<Character> ls = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                ls.add(c);
            }
        }
        Collections.sort(ls);

        StringBuilder result = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                result.append(ls.get(idx++));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}