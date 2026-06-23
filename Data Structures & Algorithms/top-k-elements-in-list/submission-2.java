class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int c=0;
        int[]ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[]buckets=new ArrayList[nums.length+1];
        //List<Integer>itr=new ArrayList();
        for(int i=0;i<buckets.length;i++) buckets[i]=new ArrayList<>();
        for(int e:nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            buckets[e.getValue()].add(e.getKey());
        }
        for(int i=buckets.length-1;i>=0;i--){
            for(int e:buckets[i]){
                ans[c++]=e;
                if(c==k) return ans;
            }
        }
        return ans;
    }
}