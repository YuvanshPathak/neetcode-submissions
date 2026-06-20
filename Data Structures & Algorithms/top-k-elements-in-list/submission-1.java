class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]ans=new int[k];
        int index=0;
        List<Integer>[] sol=new List[nums.length+1];
        for (int i=0;i<sol.length;i++){
            sol[i] = new ArrayList<>();}
        for(int i:nums){
            if(!map.containsKey(i)) map.put(i,1);
            else map.put(i,map.get(i)+1);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            sol[e.getValue()].add(e.getKey());
        }
        for(int i=sol.length-1;i>=0;i--){
            if(!sol[i].isEmpty()){
                for(int e:sol[i]){
                    if(index==k) return ans;
                    else ans[index++]=e;
                }
            }
        }
        return ans;
    }
}