class Solution {
    public int findMinFibonacciNumbers(int k) {
        if (k<=1) {
            return k;
        }
        int a = 1, b = 1, c = 2;
        while (c<=k) {
            a = b;
            b = c;
            c = a+b;
        }
        return 1 + findMinFibonacciNumbers(k-b);
    }
}