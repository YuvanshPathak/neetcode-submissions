class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        //List<List<String>>ans=new ArrayList<>();
        for(String s: strs){
            char[] str=s.toCharArray();
            Arrays.sort(str);
            String sorteds=new String(str);
            if(!map.containsKey(sorteds)) 
            map.put(sorteds,new ArrayList<>());
            map.get(sorteds).add(s);
        }
        return new ArrayList<>(map.values());
    }
}