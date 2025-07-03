class Solution {
    static int sol(int n, int k){
        if(n == 1){
            return 0;
        }
        return (sol(n - 1, k) + k)%n;

    }
    public int findTheWinner(int n, int k) {
        return sol(n,k)+1;
    }
}