class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
  
        StringBuilder res = new StringBuilder();


        for(String str:strs){
            res.append(str.length()).append('#').append(str);
        }
       
        return res.toString();
        
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i,j));
            i = j;
        }
        return res;
    }
}
