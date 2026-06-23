class Solution {
    public int longestConsecutive(int[] nums) {
        int cmax=0;
        HashSet<Integer>set=new HashSet<>();
        for(int e:nums) set.add(e);
        for(int e:nums){
            if(!set.contains(e-1)){
                int curnum=e;
                int c=1;
                while(set.contains(curnum+1)){
                    curnum+=1;
                    c+=1;
            }
            if(c>cmax) cmax=c;
        }
    }
    return cmax;
}
}