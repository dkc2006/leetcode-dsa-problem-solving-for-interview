class Solution {
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {
        int n = s.length();
        int start = 0;
        int end = s.length() - 1;

        char[] ch = s.toCharArray();

        while (start < end) {
            while (start < end && !isVowel(ch[start])) {
                start++;
            }
            while (start < end && !isVowel(ch[end])) {
                end--;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;

        }
        return new String(ch);
    }
}