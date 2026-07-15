class Solution {
    int[][] directions = {{-1,0},{0,-1},{1,0},{0,1}};
    Map<String,Integer> dp = new HashMap<>();
    public int longestIncreasingPath(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int LIP = 0;
        for(int r = 0;r<rows;r++){
            for(int c = 0;c<cols;c++){
                LIP = Math.max(LIP,dfs(matrix,r,c,Integer.MIN_VALUE));
            }

        }
        return LIP;
    }

    public int dfs(int[][]matrix, int i, int j, int preval){
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(i<0||i>=rows||j<0||j>=cols||matrix[i][j]<=preval){
            return 0;
        }
        String key  = i + ","+j;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int res = 1;
        for(int[] d:directions){
            res = Math.max(res, 1+dfs(matrix,i+d[0],j+d[1],matrix[i][j]));
           
        }
        dp.put(key,res);
        return res;
        
    }
}
