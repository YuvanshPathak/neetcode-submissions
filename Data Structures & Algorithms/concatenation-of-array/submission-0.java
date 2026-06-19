class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int x=0;
        int[] ans= new int[2*n];
        for(int e:nums)
        ans[x++]=e;
        for(int e:nums)
        ans[x++]=e;
        return ans;
    }
}