class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray, charArray2);
    }
}