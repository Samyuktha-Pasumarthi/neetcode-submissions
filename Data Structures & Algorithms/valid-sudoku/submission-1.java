class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] squares = new HashSet[9];

        for(int i = 0;i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for(int r = 0;r<9;r++){
            for(int c = 0;c<9;c++){
                if(board[r][c] == '.') continue;

                char num = board[r][c];
                int squaresKey = (r/3)*3 + (c/3);

                if(rows[r].contains(num)||cols[c].contains(num)||squares[squaresKey].contains(num)){
                    return false;
                }

            rows[r].add(num);
            cols[c].add(num);
            squares[squaresKey].add(num);
            }
        }

        return true;

        

        
    }
}
