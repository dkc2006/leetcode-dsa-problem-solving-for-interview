class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = pref.length();
        int words_len = words.length;
        int count = 0;
        for (int i = 0; i < words_len; i++) {
            if (words[i].length() >= len) {
                String check_prefix = words[i].substring(0, len);
                if (pref.equals(check_prefix)) {
                    count++;
                }
            }
        }
        return count;
    }
}