class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        HashSet<Integer>set=new HashSet<>();
        for(int e:nums) set.add(e);
        for(int e:nums){
            if(!set.contains(e-1)){
                int curStrt=e;
                int curLong=1;
                while(set.contains(curStrt+1)){
                    curStrt+=1;
                    curLong+=1;
                }
                if(curLong>ans) ans=curLong;
            }
        }
        return ans;
}
}