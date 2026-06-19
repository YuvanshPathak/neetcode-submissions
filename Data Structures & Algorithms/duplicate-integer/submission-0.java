class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans=false;
        Set<Integer> hset= new HashSet<>();
        for(int e: nums){
            if(!hset.contains(e))
            hset.add(e);
            else ans=true;
        }
        return ans;
    }
}