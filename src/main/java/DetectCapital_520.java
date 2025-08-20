class Solution {
    public boolean detectCapitalUse(String word) {

        String up = word.toUpperCase();
        String low = word.toLowerCase();
        String first = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

        if (word.equals(up))
            return true;
        if (word.equals(low))
            return true;
        if (word.equals(first))
            return true;

        return false;
    }
}