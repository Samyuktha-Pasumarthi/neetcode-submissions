class Solution {
    public int climbStairs(int n) {

        int two = 1;
        int one = 1;
        int ways = 0;

        if(n<=1){
            return 1;
        }

        for(int i=2;i<=n;i++){
            ways = one+two;
            two = one;
            one = ways;
        }

        return ways;
        
    }
}
