package Recursion;

public class TilingProblem {
    public static int tiling(int n){
        //base case
        if (n == 0 | n == 1){
            return 1; // n 0 or 1 jai hok na kn 1 ways a solve kora jai so return 1
        }
        //kaam
        //vertical choice
        int fnm1 = tiling( n - 1);
        //horizontal choice
        int fnm2 = tiling(n - 2);
        // total ways
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 4;
        int ways = tiling(n);
        System.out.println(ways);
        
    }
    
}
