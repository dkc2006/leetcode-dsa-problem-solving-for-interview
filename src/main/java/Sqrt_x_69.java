class Solution{
    public int mySqrt(long x){
        long start = 1;
        long end = x;
        long ans = 0;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(mid*mid == x){
                ans = (int)mid;
                break;
            }
            else if(mid*mid < x){
                start =mid +1;
                ans = mid;
            }else{
                end = mid-1;
            }
        }
        return (int) ans;
    }
}


// class Solution {
//   public int mySqrt(long x) {
//     long l = 1;
//     long r = x + 1;

//     while (l < r) {
//       final long m = (l + r) / 2;
//       if (m > x / m)
//         r = m;
//       else
//         l = m + 1;
//     }

//     // l := the minimum number s.t. l * l > x
//     return (int) l - 1;
//   }
// }


// OR

// import java.util.*;
// class Solution {
//   public int mySqrt(long x) {
//     int n = (int)Math.sqrt(x);
//     return n;
//   }
// }