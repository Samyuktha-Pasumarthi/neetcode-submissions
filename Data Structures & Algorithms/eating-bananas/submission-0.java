class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ub = 0;
        for(int p:piles){
            ub = Math.max(ub,p);
        }
        int lb = 1;
        int res = ub;

        while(lb<=ub){
            int k = (ub+lb)/2;
            long totaltime = 0;
            for(int p:piles){
            totaltime += Math.ceil((double) p/k);

            }
            if(totaltime<=h){
                ub = k-1;
                res = k;

            }

            else{
                lb = k+1;
            }
        }
        return res;



    }
}
