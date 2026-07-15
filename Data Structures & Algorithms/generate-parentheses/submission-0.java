class Solution {
    private void backtrack(int open,int n, int close, List<String> res, StringBuilder stack){
       if(close == n && open == n){
        res.add(stack.toString());
        return;
       }

       if(open < n){
        stack.append('(');
        backtrack(open+1,n,close,res,stack);
        stack.deleteCharAt(stack.length()-1);
       }
       if(close<open){
        stack.append(')');
        backtrack(open,n,close+1,res,stack);
        stack.deleteCharAt(stack.length()-1);
       }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0,n,0,res,stack);
        return res;
        
    }
}
