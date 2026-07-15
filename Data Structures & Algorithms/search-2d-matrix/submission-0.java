class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;

        while(top<=bottom){
            int row = (top+bottom)/2;
            
            if(matrix[row][columns-1]<target){
                top = row+1;
            }

            else if(target<matrix[row][0]){
                bottom = row-1;
            }
            else{
                break;
            }

        }

        if(!(top<=bottom)){
            return false;
        }

        int row = (top+bottom)/2;

        int l = 0;
        int r = columns - 1;

        while(l<=r){
            int mid = (l+r)/2;

            if(matrix[row][mid]<target){
                l = mid + 1;
            }

            else if(matrix[row][mid]>target){
                r = mid-1;
            }
            else{
                return true;
            }
        }

        return false;
        
    }
}