public class TimeMap {
    private Map<String, TreeMap<Integer, String>> timeMap;

    public TimeMap() {
        
        
        timeMap = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        timeMap.computeIfAbsent(key,k -> new TreeMap<>()).put(timestamp,value);

    }
    
    public String get(String key, int timestamp) {
        if(!timeMap.containsKey(key)) return "";
        TreeMap<Integer,String> map = timeMap.get(key);
        Map.Entry<Integer,String> values = map.floorEntry(timestamp);
        return values == null ? "" : values.getValue();
       
    
    
    }

   

        
    

    
}
