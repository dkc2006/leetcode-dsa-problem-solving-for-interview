class Solution {
    public long coloredCells(long n) {
        return (long) ((2L * (n * n)) - (2L * n) + 1);
    }
}