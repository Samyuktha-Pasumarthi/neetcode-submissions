class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<int[]> stack = new Stack<>();

        for(int i = 0;i<n;i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && stack.peek()[0]<t){
                int[] pair = stack.pop();
                result[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t,i});
        }

        return result;




        
    }
}
